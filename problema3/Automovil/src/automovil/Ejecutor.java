package automovil;

public class Ejecutor {

    public static void main(String[] args) {
        Automovil a1 = new Automovil("0899635871", "Ford Mustang", 1967, 52000.00);
        Automovil a2 = new Automovil("1298473688", "Toyota Corolla", 1987, 32000.00);
        a1.establecerValorM();
        a2.establecerValorM();
        System.out.printf("%s\n", a1);
        System.out.printf("%s\n", a2);
    }
}
