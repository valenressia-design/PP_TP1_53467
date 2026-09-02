

import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public final int CUPO_MINIMO = 10;
    private List<Inscripcion> inscripciones;
    public Actividad(int id, String titulo, int cupoMaximo){
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>();
    }
    public Inscripcion inscribir(Estudiante estudiante){
        if (inscripciones.size()<cupoMaximo){
            Inscripcion nueva = new Inscripcion(estudiante);
            inscripciones.add(nueva);
            return nueva;
        }else{
            System.out.println("Cupo lleno para la actividad: " + titulo);
            return null;
        }
    }
    public void mostrarInscripciones(){
        System.out.println("--Inscripciones para " + titulo + " ---");
        for (Inscripcion ins : inscripciones){
            System.out.println("-Alumno: " + ins.getEstudiante().getNombre());
        }
    }
    public final void mostrarIdentificacion(){
        System.out.println("ID: " + this.id + " | Título: " + this.titulo + " | Tipo: " + this.getTipo() + " | Costo materiales:$ " + this.calcularCostoMateriales());
    }

    public abstract String getTipo();
    public abstract double calcularCostoMateriales();

}
