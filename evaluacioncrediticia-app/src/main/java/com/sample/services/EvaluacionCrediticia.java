package com.sample.services;

import java.util.List;

import com.sample.domain.Producto;
import com.sample.domain.Prospecto;

public interface EvaluacionCrediticia {
	
	public void obtenerOfertas(Prospecto prod, List<Producto> productos);

}
