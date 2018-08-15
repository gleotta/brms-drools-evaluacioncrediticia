package demos.prestamos;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Prestamo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Monto")
   private int monto;
   @org.kie.api.definition.type.Label(value = "Aprobado")
   private boolean aprobado;
   @org.kie.api.definition.type.Label(value = "Duracion")
   private int duracion;
   @org.kie.api.definition.type.Label(value = "TazaInteres")
   private double tazaInteres;

   public Prestamo()
   {
   }

   public int getMonto()
   {
      return this.monto;
   }

   public void setMonto(int monto)
   {
      this.monto = monto;
   }

   public boolean isAprobado()
   {
      return this.aprobado;
   }

   public void setAprobado(boolean aprobado)
   {
      this.aprobado = aprobado;
   }

   public int getDuracion()
   {
      return this.duracion;
   }

   public void setDuracion(int duracion)
   {
      this.duracion = duracion;
   }

   public double getTazaInteres()
   {
      return this.tazaInteres;
   }

   public void setTazaInteres(double tazaInteres)
   {
      this.tazaInteres = tazaInteres;
   }

   public Prestamo(int monto, boolean aprobado, int duracion,
         double tazaInteres)
   {
      this.monto = monto;
      this.aprobado = aprobado;
      this.duracion = duracion;
      this.tazaInteres = tazaInteres;
   }

}