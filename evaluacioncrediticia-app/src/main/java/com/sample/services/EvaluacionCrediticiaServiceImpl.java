package com.sample.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.drools.core.impl.StatefulKnowledgeSessionImpl.AgendaFilterWrapper;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.ObjectFilter;
import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.rule.Match;

import com.sample.domain.CentralRiesgo;
import com.sample.domain.Oferta;
import com.sample.domain.Producto;
import com.sample.domain.Prospecto;
import com.sample.util.BRMSUtil;

public class EvaluacionCrediticiaServiceImpl implements EvaluacionCrediticia {

	
	public void obtenerOfertas(Prospecto prosp, List<Producto> productos) {
		
		//obtenemos la ksession
		KieSession ks = BRMSUtil.getInstance().getStatefulSession();
		
		//insertar hechos
		com.redhat.evaluacioncrediticia.Prospecto pr = insertarProspecto(prosp, ks);
		insertarProductos(productos, ks);
		
		//lanzar reglas
		ks.startProcess("com.redhat.evaluacioncrediticia.OfertaCliente");
		ks.fireAllRules();
		
		//obtengo resultados
		ObjectFilter ob = new ObjectFilter() {
			
			public boolean accept(Object obj) {
				if (obj instanceof com.redhat.evaluacioncrediticia.Oferta) {
					return true;
				} else {
					return false;
				}
			}
		};
		
		//transformo resultado
		Collection<com.redhat.evaluacioncrediticia.Oferta> ofertas = (Collection<com.redhat.evaluacioncrediticia.Oferta>) ks.getObjects(ob);
		
		List<Oferta> ofertasReal = convertirOfertas(ofertas, prosp);
		prosp.setOfertas(ofertasReal);
		actualizarProspecto(prosp, pr);
		ks.dispose();
	}


	private com.redhat.evaluacioncrediticia.Prospecto insertarProspecto(Prospecto pros, KieSession ks) {

		com.redhat.evaluacioncrediticia.Prospecto prospPia = new com.redhat.evaluacioncrediticia.Prospecto();
		prospPia.setIdDoc(pros.getIdentificador());
		prospPia.setNivelCliente(pros.getEstrato());
		prospPia.setNombre(pros.getNombre());
		prospPia.setMaxEndeudamiento(0.0);
		prospPia.setTotalDeuda(-1.0);
		if (pros.getRelacionDependencia())
			prospPia.setRelacionDependencia('D');
		else
			prospPia.setRelacionDependencia('I');
		
		prospPia.setSalario(pros.getSalario());
		prospPia.setCentralRiesgo(new ArrayList<com.redhat.evaluacioncrediticia.CentralRiesgo>());
	
		List<CentralRiesgo> centrales = pros.getCentralesRiesgo();
		FactHandle handlePros = ks.insert(prospPia);
		for (CentralRiesgo central : centrales) {
			com.redhat.evaluacioncrediticia.CentralRiesgo cr = new com.redhat.evaluacioncrediticia.CentralRiesgo();
			cr.setCantidad(central.getCantidadOperacion());
			cr.setImporteDeuda(central.getTotalDeuda());
			cr.setProspecto(prospPia);
			cr.setTipoOpereracion(central.getTipoOperacion());
			prospPia.getCentralRiesgo().add(cr);
			ks.insert(cr);
		}
		ks.update(handlePros, prospPia);
		return prospPia;
	}
	
	private void insertarProductos(List<Producto> productos, KieSession ks) {
		for (Producto producto : productos) {
			com.redhat.evaluacioncrediticia.Producto prodPia = new com.redhat.evaluacioncrediticia.Producto();
			prodPia.setLimite(producto.getMontoLimite());
			prodPia.setTarget(producto.getEstrato());
			prodPia.setTipoOperacion(producto.getTipoOperacion());
			ks.insert(prodPia);
		}
	}
	
	private List<Oferta> convertirOfertas(
			Collection<com.redhat.evaluacioncrediticia.Oferta> ofertas, Prospecto pros) {
		List<Oferta> ret = new ArrayList<Oferta>();
		for (com.redhat.evaluacioncrediticia.Oferta oferta : ofertas) {
			Producto prod = new Producto(oferta.getProducto().getLimite(), 
					oferta.getProducto().getTipoOperacion(), oferta.getProducto().getTarget());
			
			Oferta of = new Oferta();
			of.setProducto(prod);
			of.setMonto(oferta.getMontoMaximo());
			of.setProspecto(pros);
			ret.add(of);
		}
		return ret;
	}
	
	private void actualizarProspecto(Prospecto pd, com.redhat.evaluacioncrediticia.Prospecto pr) {
		pd.setTotalDeuda(pr.getTotalDeuda());
		pd.setCapacidadEndeudamiento(pr.getMaxEndeudamiento());
		pd.setEstrato(pr.getNivelCliente());
	}

}
