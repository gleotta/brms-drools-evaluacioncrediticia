package com.redhat.evaluacioncrediticia;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(3b98acd282eaf67187278cfb405902b1)
 */
@org.kie.api.definition.type.Label(value = "Producto")
public class Producto extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Importe Limite")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Double limite;
    
    @org.kie.api.definition.type.Label(value = "Nivel CLiente")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Integer target;
    
    @org.kie.api.definition.type.Label(value = "Tipo Operacion")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer tipoOperacion;

    public Producto() {
    }

    public Producto(java.lang.Integer tipoOperacion, java.lang.Double limite, java.lang.Integer target) {
        this.tipoOperacion = tipoOperacion;
        this.limite = limite;
        this.target = target;
    }


    
    public java.lang.Double getLimite() {
        return this.limite;
    }

    public void setLimite(java.lang.Double limite) {
        this.limite = limite;
    }
    
    public java.lang.Integer getTarget() {
        return this.target;
    }

    public void setTarget(java.lang.Integer target) {
        this.target = target;
    }
    
    public java.lang.Integer getTipoOperacion() {
        return this.tipoOperacion;
    }

    public void setTipoOperacion(java.lang.Integer tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
}