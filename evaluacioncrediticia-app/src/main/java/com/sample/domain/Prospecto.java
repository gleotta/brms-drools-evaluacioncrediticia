package com.sample.domain;

import java.util.List;

public class Prospecto {
	
	public Prospecto(Integer identificador, String nombre,
			Boolean relacionDependencia, Double salario) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.relacionDependencia = relacionDependencia;
		this.salario = salario;
	}

	private java.util.List<CentralRiesgo> centralesRiesgo;
    
    private java.lang.Integer edad;
    
    private java.lang.String estadoCivil;
    
    private java.lang.String genero;
    
    private Integer identificador;
    
    private java.lang.String nombre;
    
    private java.lang.Boolean relacionDependencia;
    
    private java.lang.Double salario;
    
    private java.lang.Double totalDeuda;
    
    private java.lang.Double capacidadEndeudamiento;
    
    private Integer estrato;
    
    public Prospecto(Integer identificador, String nombre,
			Boolean relacionDependencia, Double salario, Integer estrato) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.relacionDependencia = relacionDependencia;
		this.salario = salario;
		this.estrato = estrato;
	}

	private List<Oferta> ofertas;

	public java.util.List<CentralRiesgo> getCentralesRiesgo() {
		return centralesRiesgo;
	}

	public void setCentralesRiesgo(java.util.List<CentralRiesgo> centralesRiesgo) {
		this.centralesRiesgo = centralesRiesgo;
	}

	public java.lang.Integer getEdad() {
		return edad;
	}

	public void setEdad(java.lang.Integer edad) {
		this.edad = edad;
	}

	public java.lang.String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(java.lang.String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public java.lang.String getGenero() {
		return genero;
	}

	public void setGenero(java.lang.String genero) {
		this.genero = genero;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public java.lang.String getNombre() {
		return nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.Boolean getRelacionDependencia() {
		return relacionDependencia;
	}

	public void setRelacionDependencia(java.lang.Boolean relacionDependencia) {
		this.relacionDependencia = relacionDependencia;
	}

	public java.lang.Double getSalario() {
		return salario;
	}

	public void setSalario(java.lang.Double salario) {
		this.salario = salario;
	}

	public java.lang.Double getTotalDeuda() {
		return totalDeuda;
	}

	public void setTotalDeuda(java.lang.Double totalDeuda) {
		this.totalDeuda = totalDeuda;
	}

	public List<Oferta> getOfertas() {
		return ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	public Integer getEstrato() {
		return estrato;
	}

	public void setEstrato(Integer estrato) {
		this.estrato = estrato;
	}
	
	public java.lang.Double getCapacidadEndeudamiento() {
		return capacidadEndeudamiento;
	}

	public void setCapacidadEndeudamiento(java.lang.Double capacidadEndeudamiento) {
		this.capacidadEndeudamiento = capacidadEndeudamiento;
	}


	@Override
	public String toString() {
		return "Prospecto ["
				+ (edad != null ? "edad=" + edad + ", " : "")
				+ (estadoCivil != null ? "estadoCivil=" + estadoCivil + ", "
						: "")
				+ (genero != null ? "genero=" + genero + ", " : "")
				+ (identificador != null ? "identificador=" + identificador
						+ ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (relacionDependencia != null ? "relacionDependencia="
						+ relacionDependencia + ", " : "")
				+ (salario != null ? "salario=" + salario + ", " : "")
				+ (totalDeuda != null ? "totalDeuda=" + totalDeuda + ", " : "")
				+ (capacidadEndeudamiento != null ? "capacidadEndeudamiento=" + capacidadEndeudamiento + ", " : "")
				+ (estrato != null ? "estrato=" + estrato + ", " : "")
				+ (ofertas != null ? "ofertas=" + ofertas : "") + "]";
	}


	

}
