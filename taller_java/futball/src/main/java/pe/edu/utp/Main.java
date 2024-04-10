package pe.edu.utp;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Jugador
        Jugador jugador1 = new Jugador("Jugador 1", 25, "Perú", 1, "Delantero");
        Jugador jugador2 = new Jugador("Jugador 2", 28, "Argentina", 2, "Mediocampista");
        Jugador jugador3 = new Jugador("Jugador 3", 30, "Brasil", 3, "Defensor");

        // Crear objeto Entrenador
        Entrenador entrenador = new Entrenador("Entrenador 1");

        // Crear objeto Equipo
        Equipo equipo = new Equipo("Equipo 1", entrenador);

        // Agregar jugadores al equipo
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        // Imprimir información del equipo
        equipo.imprimirEquipo();
    }
}