package com.sample.domain;

public class Producto {
	

	private java.lang.Double montoLimite;

	private java.lang.Integer tipoOperacion;
	
	private Integer estrato;

	

	public Producto(Double montoLimite, Integer tipoOperacion, Integer estrato) {
		super();
		this.montoLimite = montoLimite;
		this.tipoOperacion = tipoOperacion;
		this.estrato = estrato;
	}

	public java.lang.Double getMontoLimite() {
		return montoLimite;
	}

	public void setMontoLimite(java.lang.Double montoLimite) {
		this.montoLimite = montoLimite;
	}

	public java.lang.Integer getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(java.lang.Integer tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public Integer getEstrato() {
		return estrato;
	}

	public void setEstrato(Integer estrato) {
		this.estrato = estrato;
	}

	@Override
	public String toString() {
		return "Producto ["
				+ (montoLimite != null ? "montoLimite=" + montoLimite + ", "
						: "")
				+ (tipoOperacion != null ? "tipoOperacion=" + tipoOperacion
						+ ", " : "")
				+ (estrato != null ? "estrato=" + estrato : "") + "]";
	}

	

}
