import java.util.List;

public class App {
    public static void main(String[] args){
        EventoUniversitario e1 = new EventoUniversitario("EV001", "Jornada de testing de Software", 15000,false);
        EventoUniversitario e2 = new EventoUniversitario("EV002","Hackathon UTN 2026", 0,true);
        EventoUniversitario copiae1 = new EventoUniversitario(e1);
        EventoUniversitario copiae2 = new EventoUniversitario(e2);
        System.out.println("Cantidad total de eventos creados: " + EventoUniversitario.getCantidadEventos());
        Estudiante est1 = new Estudiante("53467", "Valentin Ressia");
        Estudiante est2 = new Estudiante("54321", "Juan Lopez");
        Estudiante est3 = new Estudiante("12345", "Martin Perez");
        Sala sala1 = new Sala(101, "Auditorio Principal");
        e1.asignarSala(sala1);
        e1.crearActividad(1,"Taller de Java", 30,"Taller");
        e1.crearActividad(2,"Charla de testing", 50,"Charla");
        List<Actividad> listaactividades = e1.getActividades();
        Actividad tallerJava = listaactividades.get(0);
        Actividad charlaTesting = listaactividades.get(1);
        tallerJava.inscribir(est1);
        tallerJava.inscribir(est2);
        charlaTesting.inscribir(est3);
        System.out.println("---EJERCICIO 3---");
        e1.mostrarDatos();
        System.out.println("Total de eventos creados: " + EventoUniversitario.getCantidadEventos());


    }
}
