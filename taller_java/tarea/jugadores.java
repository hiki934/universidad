package tarea;
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
