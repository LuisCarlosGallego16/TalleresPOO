package TercerTallerSegundoCorte;
//Salario devengado : Salario total que recibe un empleado en una empresa o trabajo
//deducciones : monto de dinero que se resta del salario devengado para pagar obligaciones legales
//Salario neto : monto de dinero que recibe un empleado en total, despues de todos los descuentos

public class Empleado {

    private String nombre;
    private String apellido;
    String numeroSeguridadSocial;
    private double salarioBase;

    //Creo dos atributos para el calculo de ducciones, para hacerlo mejor tomo las deducciones del empleadoSueldo
    //Tambien lo hago para no tener que pasar parametros a los metodos y poder hacer bien la sobrescritura.
    private double pagoPension;
    private double pagoSalud;

    public Empleado(String nombre, String apellido, String numeroSeguridadSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salarioBase = salarioBase;
    }

    public double calcularDevengado() {
        return salarioBase;
    }

    public double calcularDeducciones() {
        double deduccionesTotales = pagoPension + pagoSalud;
        return deduccionesTotales;
    }

    public double calcularSalarioNeto() {
        double deduccionTotal = pagoPension + pagoSalud;
        double salarioNetoTotal = salarioBase - deduccionTotal;
        return salarioNetoTotal;
    }

    public String getInformacion() {
        return "EMPLEADO \n"
                + "NOMBRE: " + nombre + "\n" + "APELLIDO: " + apellido + "\n"
                + "NUMERO SEGURIDAD SOCIAL: " + numeroSeguridadSocial + "\n"
                + "SALARIO BASE:" + salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
}
