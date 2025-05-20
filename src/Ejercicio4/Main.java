package Ejercicio4;

import java.util.ArrayList;

class Libro {
    String autor;
    String numRegistro; // De la forma 1234ABC
    int añoEdicion;

    public Libro(String autor, String numRegistro, int anoEdicion) {
        this.autor = autor;
        this.numRegistro = numRegistro;
        this.añoEdicion = anoEdicion;
    }

    @Override
    public String toString() {
        return autor + " - " + numRegistro + " - " + añoEdicion;
    }
}

public class Main {

    public static ArrayList<Libro> librosPares(ArrayList<Libro> libros) {
        ArrayList<Libro> resultado = new ArrayList<>();

        for (Libro libro : libros) {
            // Extrae la parte numérica del número de registro
            String numParte = libro.numRegistro.replaceAll("[^0-9]", ""); // solo números
            try {
                int numero = Integer.parseInt(numParte);
                if (numero % 2 == 0) {
                    resultado.add(libro);
                }
            } catch (NumberFormatException e) {
                System.out.println("Número de registro inválido: " + libro.numRegistro);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("Autor A", "1234ABC", 2001));
        listaLibros.add(new Libro("Autor B", "1235XYZ", 2005));
        listaLibros.add(new Libro("Autor C", "2468DEF", 2010));
        listaLibros.add(new Libro("Autor D", "0001GHI", 2022));

        ArrayList<Libro> librosConNumPar = librosPares(listaLibros);

        System.out.println("Libros con número de registro par:");
        for (Libro libro : librosConNumPar) {
            System.out.println(libro);
        }
    }
}

