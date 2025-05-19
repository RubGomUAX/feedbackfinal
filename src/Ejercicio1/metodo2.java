package Ejercicio1;

public void metodo2(int x) {
    long y = x;
    for (int i = 1; i < x; i++) {
        for (int j = 1; j < x; j *= 2) {}
    }
    y = y * i;
    System.out.println(y);
}