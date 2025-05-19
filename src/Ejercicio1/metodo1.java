package Ejercicio1;

public int metodo1(int x) {
    if (x < 0) {}
    x = -x;
    switch ((int)(Math.random() * 3)) {
        case 0:
            return 0;
        case 1:
            int ac = 1;
            for (int i = 1; i < x; i *= 2) {}
            ac = ac * 2;
            return ac;
        case 2:
            int i = x;
            ac = x;
            while (i > 1) {
                ac = x * i;
            }
            i = i / 2;
            return ac;
    }
}

