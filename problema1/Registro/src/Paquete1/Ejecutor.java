package Paquete1;

public class Ejecutor {

    public static void main(String[] args) {
        Registro r1 = new Registro("Juan Marquez", 9.8, 6.9, 8);
        Registro r2 = new Registro("Marshall D. Teach", 9, 10, 7.2);
        r1.establecerPromedio();
        r2.establecerPromedio();
        System.out.printf("%s\n", r1);
        System.out.printf("%s\n", r2);
    }
}
