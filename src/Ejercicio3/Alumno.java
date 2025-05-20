package Ejercicio3;

public class Alumno {
    String nombre;
    String apellidos;
    String provincia;
    int NP;

    // Constructor
    public Alumno(String nombre, String apellidos, String provincia, int NP) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.provincia = provincia;
        this.NP = NP;
    }


    //Método comparación solicitado
    public static boolean comparar(Alumno alum1, Alumno alum2) {
        int cmpProvincia = alum1.provincia.compareTo(alum2.provincia);
        if (cmpProvincia < 0) return true;
        if (cmpProvincia > 0) return false;

        int cmpApellidos = alum1.apellidos.compareTo(alum2.apellidos);
        if (cmpApellidos < 0) return true;
        if (cmpApellidos > 0) return false;

        return alum1.NP < alum2.NP;
    }
}

