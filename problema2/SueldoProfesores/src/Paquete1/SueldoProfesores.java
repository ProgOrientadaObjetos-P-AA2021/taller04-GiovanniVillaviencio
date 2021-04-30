package Paquete1;

public class SueldoProfesores {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo;
    private double sueldoT;

    public SueldoProfesores(String n, String a, String c, double s) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldo = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldo(Double s) {
        sueldo = s;
    }

    public void establecerSueldoT() {
        sueldoT = (sueldo * 0.20) + sueldo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerSueldoT() {
        return sueldoT;
    }

    @Override
    public String toString() {
        String cadena = String.format("Los datos del profesor son\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cédula: %s\n"
                + "Sueldo básico: %.2f\n"
                + "Sueldo total: %.2f\n",
                obtenerNombre(), obtenerApellido(),
                obtenerCedula(), obtenerSueldo(),
                obtenerSueldoT());
        return cadena;
    }
}
