
package profesoresinstituto;


public class ProfesoresInstituto {
    private String nombre;
    private String apellido;
    private Double sueldoBasico;
    private Double sueldoTotal;
    private Double cedula;
    
    public ProfesoresInstituto(){
        nombre = "Juan";
        apellido = "Medina";
        sueldoBasico = 750.00;
        sueldoTotal = ((sueldoBasico)*0.20)+ sueldoBasico;
    }
    
    
}
