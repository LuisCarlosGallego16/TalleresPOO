package TercerTallerSegundoCorte;
//Salario devengado : Salario total que recibe un empleado en una empresa o trabajo
//deducciones : monto de dinero que se resta del salario devengado para pagar obligaciones legales
//Salario neto : monto de dinero que recibe un empleado en total, despues de todos los descuentos

public class Empleado {

    private String nombre;
    private String apellido;
    private String numeroSeguridadSocial;
    private double salarioBase;

    public Empleado(String nombre, String apellido, String numeroSeguridadSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salarioBase = salarioBase;
    }

    public double calcularDevengado() {
        return salarioBase;
    }

    //Se crean dos deducciones al empleado simulando el descuento
    public double calcularDeducciones(double pagoPension, double pagoSalud) {
        return pagoPension + pagoSalud;
    }

    public double calcularSalarioNeto(double pagoPension, double pagoSalud, double salarioBase) {
        double deduccionTotal = calcularDeducciones(pagoPension, pagoSalud);
        double salarioNetoTotal = salarioBase - deduccionTotal;
        return salarioNetoTotal;
    }

    public String getInformacion() {
        return "EMPLEADO \n"
                + "NOMBRE: " + nombre + "\n" + "APELLIDO: " + apellido + "\n"
                + "NUMERO SEGURIDAD SOCIAL: " + numeroSeguridadSocial + "\n"
                + "SALARIO BASE:" + salarioBase;
    }
}
