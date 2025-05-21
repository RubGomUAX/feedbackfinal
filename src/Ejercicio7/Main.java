package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        ListaJugadores lista = new ListaJugadores();

        lista.agregarJugador(new Jugador("Messi", "PSG", "Delantero", 3000000, 500000));
        lista.agregarJugador(new Jugador("Cristiano", "Al-Nassr", "Delantero", 2500000, 400000));
        lista.agregarJugador(new Jugador("Modric", "Real Madrid", "Centrocampista", 1800000, 300000));

        int total = lista.totalSueldos();
        System.out.println("Total de sueldos base: " + total + " euros");
    }
}
