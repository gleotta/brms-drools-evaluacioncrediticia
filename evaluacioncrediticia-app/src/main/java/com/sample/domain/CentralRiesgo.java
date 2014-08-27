package com.sample.domain;

public class CentralRiesgo {
	
	public CentralRiesgo(Integer cantidadOperacion, Prospecto prospecto,
			Integer tipoOperacion, Double totalDeuda) {
		super();
		this.cantidadOperacion = cantidadOperacion;
		this.prospecto = prospecto;
		this.tipoOperacion = tipoOperacion;
		this.totalDeuda = totalDeuda;
	}

	private Integer cantidadOperacion;
    
    private Prospecto prospecto;
    
    private Integer tipoOperacion;
    
    private Double totalDeuda;
	
    public Integer getCantidadOperacion() {
		return cantidadOperacion;
	}

	public void setCantidadOperacion(Integer cantidadOperacion) {
		this.cantidadOperacion = cantidadOperacion;
	}

	public Prospecto getProspecto() {
		return prospecto;
	}

	public void setProspecto(Prospecto prospecto) {
		this.prospecto = prospecto;
	}

	public Integer getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(Integer tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public Double getTotalDeuda() {
		return totalDeuda;
	}

	public void setTotalDeuda(Double totalDeuda) {
		this.totalDeuda = totalDeuda;
	}

	@Override
	public String toString() {
		return "CentralRiesgo ["
				+ (cantidadOperacion != null ? "cantidadOperacion="
						+ cantidadOperacion + ", " : "")
				+ (tipoOperacion != null ? "tipoOperacion=" + tipoOperacion
						+ ", " : "")
				+ (totalDeuda != null ? "totalDeuda=" + totalDeuda : "") + "]";
	}



}
