package demos.prestamos;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Solicitante")
public class Solicitante implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Score")
   private int score;
   @org.kie.api.definition.type.Label("Nombre")
   private java.lang.String nombre;

   public Solicitante()
   {
   }

   public int getScore()
   {
      return this.score;
   }

   public void setScore(int score)
   {
      this.score = score;
   }

   public java.lang.String getNombre()
   {
      return this.nombre;
   }

   public void setNombre(java.lang.String nombre)
   {
      this.nombre = nombre;
   }

   public Solicitante(int score, java.lang.String nombre)
   {
      this.score = score;
      this.nombre = nombre;
   }

}