package Ejercicio7;

public class ListaJugadores {
    NodoJugador cabecera;

    public ListaJugadores() {
        this.cabecera = null;
    }

    public void agregarJugador(Jugador jugador) {
        NodoJugador nuevo = new NodoJugador(jugador);
        nuevo.siguiente = cabecera;
        cabecera = nuevo;
    }

    public int totalSueldos() {
        int total = 0;
        NodoJugador actual = cabecera;

        while (actual != null) {
            total += actual.jugador.getSueldo();
            actual = actual.siguiente;
        }

        return total;
    }
}
