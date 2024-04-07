package taller_java.tarea_1;
public class Jugador {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int numeroIdentificador;
    private String rol;

    public Jugador(String nombre, int edad, String nacionalidad, int numeroIdentificador, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.numeroIdentificador = numeroIdentificador;
        this.rol = rol;
    }

    public int getNumeroAsignado() {
        return this.numeroIdentificador;
    }

    public void imprimirNombre() {
        System.out.println(this.nombre);
    }
}

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> listaJugadores;

    public Equipo() {
        this.listaJugadores = new ArrayList<Jugador>();
    }

    public void agregarJugador(Jugador jugador) {
        this.listaJugadores.add(jugador);
    }

    public void imprimirNombreJugador(int indice) {
        if (indice >= 0 && indice < this.listaJugadores.size()) {
            this.listaJugadores.get(indice).imprimirNombre();
        } else {
            System.out.println("Indice fuera de rango");
        }
    }
}
