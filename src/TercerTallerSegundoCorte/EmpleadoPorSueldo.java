/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerTallerSegundoCorte;

/**
 *
 * @author luisc
 */
public class EmpleadoPorSueldo extends Empleado {

    protected double sueldoMensual;
    protected double retencionFuente;
    protected double fondoSolidaridad;
    protected double pagoSalud;
    protected double pagoPension;

    public EmpleadoPorSueldo(double sueldoMensual, double retencionFuente, double fondoSolidaridad, double pagoSalud, double pagoPension, String nombre, String apellido, String numeroSeguridadSocial, double salarioBase) {
        super(nombre, apellido, numeroSeguridadSocial, salarioBase);
        this.sueldoMensual = sueldoMensual;
        this.retencionFuente = retencionFuente;
        this.fondoSolidaridad = fondoSolidaridad;
        this.pagoSalud = pagoSalud;
        this.pagoPension = pagoPension;
    }


    @Override
    public double calcularDevengado() {
        return sueldoMensual;
    }

    @Override
    public double calcularDeducciones() {
        double deduccionesTotales = retencionFuente + fondoSolidaridad + pagoSalud + pagoPension;
        return deduccionesTotales;

    }

    @Override
    public double calcularSalarioNeto() {
        double deduccionesTotales = retencionFuente + fondoSolidaridad + pagoSalud + pagoPension;
        return sueldoMensual - deduccionesTotales;
    }

    @Override
    public String getInformacion() {
        return "EMPLEADO POR SUELDO \n"
                + "NOMBRE: " + nombre + "\n" + "APELLIDO: " + apellido + "\n"
                + "NUMERO SEGURIDAD SOCIAL: " + numeroSeguridadSocial + "\n"
                + "SALARIO BASE:" + sueldoMensual;
    }
}
