package Ejercicio7;

public class Jugador {
    private String nombre;
    private String equipo;
    private String posicion;
    private int sueldo;
    private int primas;

    public Jugador(String nombre, String equipo, String posicion, int sueldo, int primas) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
        this.sueldo = sueldo;
        this.primas = primas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getPrimas() {
        return primas;
    }

    public int getSueldoTotal() {
        return sueldo + primas;
    }

    // Otros getters/setters si se necesitan
}
