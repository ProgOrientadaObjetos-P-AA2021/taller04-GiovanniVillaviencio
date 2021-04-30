package automovil;

public class Automovil {

    private String cedula;
    private String marca;
    private int anioF;
    private double valor;
    private double valorM;

    public Automovil(String c, String m, int a, double v) {
        cedula = c;
        marca = m;
        anioF = a;
        valor = v;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerAnioF(int a) {
        anioF = a;
    }

    public void establecerValor(double v) {
        valor = v;
    }

    public void establecerValorM() {
        valorM = ((valor * 0.002) / 100) * anioF;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnioF() {
        return anioF;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorM() {
        return valorM;
    }

    @Override
    public String toString() {
        String cadena = String.format("Los datos del automotor son\n"
                + "Cedula del propietario: %s\n"
                + "Marca: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor: %.2f\n"
                + "Valor de matrícula: %.2f\n",
                obtenerCedula(), obtenerMarca(),
                obtenerAnioF(), obtenerValor(),
                obtenerValorM());
        return cadena;
    }

}
