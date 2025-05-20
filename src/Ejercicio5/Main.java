package Ejercicio5;

import java.util.Objects;
import java.util.TreeSet;

class Libro implements Comparable<Libro> {
    String autor;
    String numRegistro;
    int anoEdicion;

    public Libro(String autor, String numRegistro, int anoEdicion) {
        this.autor = autor;
        this.numRegistro = numRegistro;
        this.anoEdicion = anoEdicion;
    }

    @Override
    public int compareTo(Libro otro) {
        int resultado = Integer.compare(this.anoEdicion, otro.anoEdicion);
        if (resultado != 0) {
            return resultado;
        }
        return this.numRegistro.compareTo(otro.numRegistro);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return anoEdicion == libro.anoEdicion &&
                Objects.equals(numRegistro, libro.numRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anoEdicion, numRegistro);
    }

    @Override
    public String toString() {
        return autor + " - " + numRegistro + " - " + anoEdicion;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeSet<Libro> libros = new TreeSet<>();

        libros.add(new Libro("Autor A", "1234ABC", 2001));
        libros.add(new Libro("Autor B", "1235XYZ", 2005));
        libros.add(new Libro("Autor C", "2468DEF", 2010));
        libros.add(new Libro("Autor D", "0001GHI", 2022));
        libros.add(new Libro("Autor E", "5555ABC", 2001)); // mismo año pero diferente registro

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}