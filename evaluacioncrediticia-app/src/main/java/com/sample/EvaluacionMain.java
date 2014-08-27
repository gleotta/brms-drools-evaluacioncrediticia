package com.sample;

import java.util.ArrayList;
import java.util.List;

import com.sample.domain.CentralRiesgo;
import com.sample.domain.Oferta;
import com.sample.domain.Producto;
import com.sample.domain.Prospecto;
import com.sample.services.EvaluacionCrediticia;
import com.sample.services.EvaluacionCrediticiaServiceImpl;
import com.sample.util.BRMSUtil;

public class EvaluacionMain {

	public static void main(String[] args) {
		// Cargo datos
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto(5000.0, 1, 1));
		productos.add(new Producto(7000.0, 1, 2));
		productos.add(new Producto(9000.0, 1, 2));
		productos.add(new Producto(5000.0, 2, 1));
		productos.add(new Producto(8000.0, 2, 2));
		System.out.println("Productos:");
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		System.out.println();

		Prospecto prospecto = new Prospecto(1234, "Pepe", true, 6850.0);
		prospecto.setCentralesRiesgo(new ArrayList<CentralRiesgo>());
		prospecto.getCentralesRiesgo().add(
				new CentralRiesgo(1, prospecto, 1, 125.0));
		prospecto.getCentralesRiesgo().add(
				new CentralRiesgo(2, prospecto, 1, 225.0));
		prospecto.getCentralesRiesgo().add(
				new CentralRiesgo(3, prospecto, 1, 525.0));
		System.out.println("Prospecto:" + prospecto);
		for (CentralRiesgo cr : prospecto.getCentralesRiesgo()) {
			System.out.println("Central Riesgo:" + cr);
		}

		// invoco servicio
		EvaluacionCrediticia service = new EvaluacionCrediticiaServiceImpl();
		System.out.println("Evaluando...");
		service.obtenerOfertas(prospecto, productos);
		List<Oferta> ofertas = prospecto.getOfertas();
		System.out.println("Finalizado...");

		// Imprimo resultados
		System.out.println("Valor Prospecto:" + prospecto);
		System.out
				.println("Cantidad de ofertas encontradas: " + ofertas.size());
		for (Oferta oferta : ofertas) {
			System.out.println("Producto Tipo Operacion: "
					+ oferta.getProducto().getTipoOperacion());
			System.out.println("Producto Monto Limite: "
					+ oferta.getProducto().getMontoLimite());
			System.out.println("Producto Monto Aprobado: " + oferta.getMonto());
			System.out.println("Producto Target: "
					+ oferta.getProducto().getEstrato());
			System.out.println("Prospecto Target: "
					+ oferta.getProspecto().getEstrato());

			System.out.println();
			//BRMSUtil.dispose();
		}

	}

}
