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