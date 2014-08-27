package com.redhat.evaluacioncrediticia;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(8abcd1ac26ef34a30888cb56193aaf1a)
 */
@org.kie.api.definition.type.Label(value = "Central de Riesgos")
public class CentralRiesgo extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Cantidad Operaciones")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer cantidad;
    
    @org.kie.api.definition.type.Label(value = "Importe Deuda")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Double importeDeuda;
    
    @org.kie.api.definition.type.Label(value = "Prospecto")
    @org.kie.api.definition.type.Position(value = 3)
    private com.redhat.evaluacioncrediticia.Prospecto prospecto;
    
    @org.kie.api.definition.type.Label(value = "Tipo Operacion")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Integer tipoOpereracion;

    public CentralRiesgo() {
    }

    public CentralRiesgo(java.lang.Integer cantidad, java.lang.Double importeDeuda, java.lang.Integer tipoOpereracion, com.redhat.evaluacioncrediticia.Prospecto prospecto) {
        this.cantidad = cantidad;
        this.importeDeuda = importeDeuda;
        this.tipoOpereracion = tipoOpereracion;
        this.prospecto = prospecto;
    }


    
    public java.lang.Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(java.lang.Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public java.lang.Double getImporteDeuda() {
        return this.importeDeuda;
    }

    public void setImporteDeuda(java.lang.Double importeDeuda) {
        this.importeDeuda = importeDeuda;
    }
    
    public com.redhat.evaluacioncrediticia.Prospecto getProspecto() {
        return this.prospecto;
    }

    public void setProspecto(com.redhat.evaluacioncrediticia.Prospecto prospecto) {
        this.prospecto = prospecto;
    }
    
    public java.lang.Integer getTipoOpereracion() {
        return this.tipoOpereracion;
    }

    public void setTipoOpereracion(java.lang.Integer tipoOpereracion) {
        this.tipoOpereracion = tipoOpereracion;
    }
}