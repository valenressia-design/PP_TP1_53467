import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {

    private Sala sala;
    private List<Actividad> actividades;
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;


    public void asignarSala(Sala sala){
        this.sala = sala;
    }

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
        this.actividades = new ArrayList<>();
    }
    public EventoUniversitario(EventoUniversitario otro){
      this.id = otro.id + "-C";
      this.titulo = otro.titulo;
      this.costoBase = otro.costoBase;
      this.gratuito = otro.gratuito;
      cantidadEventos++;
      this.actividades = new ArrayList<>();
    }

    public double calcularCostoEstimado(){
      if (this.gratuito){
        return 0.0;
      }
      double costoActividades = 0.0;
      if(this.actividades != null){
          for (Actividad act : this.actividades){
              costoActividades += act.calcularCostoMateriales();
          }
      }
      return (this.costoBase + costoActividades) * 1.21;
    }
    public void mostrarDatos(){
      System.out.println("===Evento Universitario===");
      System.out.println("ID: " + this.id);
      System.out.println("Titulo: " + this.titulo);
      System.out.println("Costo Base:$ " + this.costoBase);
      System.out.println("Gratuito: " + (this.gratuito ? "Si" : "No"));
      System.out.println("Costo estimado:$" + this.calcularCostoEstimado());
      if(this.sala != null){
          System.out.println("Sala asignada: " + this.sala.getNombre());
      } else{
          System.out.println("Sala asignada: Ninguna");

      }
        System.out.println("Actividades del evento:");
        if (this.actividades == null || this.actividades.isEmpty()) {
            System.out.println("-Sin actividades registradas.");
        } else {
            for (Actividad act : this.actividades) {
                act.mostrarIdentificacion();
                act.mostrarInscripciones();
            }
        }


      }
    public static int getCantidadEventos(){
        return cantidadEventos;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }
    public void crearActividad(int id, String titulo, int cupo, String tipo){
        if (tipo.equalsIgnoreCase("Charla")){
            Actividad nuevaCharla = new Charla(id, titulo, cupo, "A confirmar");
            this.actividades.add(nuevaCharla);
        }else if (tipo.equalsIgnoreCase("Taller")){
            Actividad nuevoTaller = new Taller(id, titulo, cupo,true);
            this.actividades.add(nuevoTaller);
        }else{
            System.out.println("Tipo de actividad desconocido.");
        }

    }

    public List<Actividad> getActividades() {
        return actividades;
    }


}
