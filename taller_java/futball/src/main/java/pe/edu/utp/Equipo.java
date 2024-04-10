package pe.edu.utp;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private Entrenador entrenador;
    private List<Jugador> listaJugadores;

    public Equipo(String nombre, Entrenador entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.listaJugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void agregarJugador(Jugador jugador) {
        listaJugadores.add(jugador);
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void imprimirEquipo() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Entrenador: " + entrenador.getNombre());
        System.out.println("Lista de jugadores:");

        for (Jugador jugador : listaJugadores) {
            System.out.println("Nombre: " + jugador.getNombre());
            System.out.println("Edad: " + jugador.getEdad());
            System.out.println("Nacionalidad: " + jugador.getNacionalidad());
            System.out.println("Numero: " + jugador.getNumero());
            System.out.println("Rol: " + jugador.getRol());
            System.out.println("---------------------------------");
        }
    }
}