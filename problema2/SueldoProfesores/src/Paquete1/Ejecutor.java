package Paquete1;

public class Ejecutor {

    public static void main(String[] args) {
        SueldoProfesores s1 = new SueldoProfesores("Leonidas", "Carvajan",
                "1198607826", 750.00);
        SueldoProfesores s2 = new SueldoProfesores("Alexander", "Samaniego",
                "0799458266", 1500.00);
        s1.establecerSueldoT();
        s2.establecerSueldoT();
        System.out.printf("%s\n", s1);
        System.out.printf("%s\n", s2);
    }

}
