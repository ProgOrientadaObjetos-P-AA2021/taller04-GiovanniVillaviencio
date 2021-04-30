package Paquete1;

public class Registro {

    private String nombre;
    private double cMateria1;
    private double cMateria2;
    private double cMateria3;
    private double promedio;

    public Registro(String n, double c1, double c2, double c3) {
        nombre = n;
        cMateria1 = c1;
        cMateria2 = c2;
        cMateria3 = c3;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCMateria1(Double c1) {
        cMateria1 = c1;
    }

    public void establecerCMateria2(Double c2) {
        cMateria2 = c2;
    }

    public void establecerCMateria3(Double c3) {
        cMateria2 = c3;
    }

    public void establecerPromedio() {
        promedio = (cMateria1 + cMateria2 + cMateria3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCMateria1() {
        return cMateria1;
    }

    public double obtenerCMateria2() {
        return cMateria2;
    }

    public double obtenerCMateria3() {
        return cMateria3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Los datos del alumno son\n"
                + "Nombre: %s\n"
                + "Calificación de materia 1: %.2f\n"
                + "Calificación de materia 2: %.2f\n"
                + "Calificación de materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombre(), obtenerCMateria1(),
                obtenerCMateria2(), obtenerCMateria3(),
                obtenerPromedio());
        return cadena;
    }

}
