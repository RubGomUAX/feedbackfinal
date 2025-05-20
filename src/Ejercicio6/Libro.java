package Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Libro implements Comparable<Libro> {

    private String autor;
    private String titulo;
    private int añoEdicion;

    public Libro(String autor, String titulo, int anoEdicion) {
        this.autor = autor;
        this.titulo = titulo;
        this.añoEdicion = anoEdicion;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int compareTo(Libro otro) {
        if (this.añoEdicion != otro.añoEdicion) {
            return Integer.compare(this.añoEdicion, otro.añoEdicion);
        }
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return autor + " - " + titulo + " - " + añoEdicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return añoEdicion == libro.añoEdicion && titulo.equals(libro.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() + añoEdicion;
    }

    public static String autorConMasLibros(TreeSet<Libro> libros) {
        Map<String, Integer> contadorAutores = new HashMap<>();

        for (Libro libro : libros) {
            contadorAutores.put(libro.autor, contadorAutores.getOrDefault(libro.autor, 0) + 1);
        }

        String autorMax = null;
        int maxLibros = 0;
        for (Map.Entry<String, Integer> entry : contadorAutores.entrySet()) {
            if (entry.getValue() > maxLibros) {
                maxLibros = entry.getValue();
                autorMax = entry.getKey();
            }
        }

        return autorMax;
    }
}