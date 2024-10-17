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

    private double sueldoMensual;
    private double retencionFuente;
    private double fondoSolidaridad;
    private double pagoSalud;
    private double pagoPension;

    //VARIABLE PARA ALMACENAR TODAS LAS DEDUCCIONES DEL EMPLEADO
    double deduccionesTotales = retencionFuente + fondoSolidaridad + pagoSalud + pagoPension;

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
        return deduccionesTotales;

    }

    @Override
    public double calcularSalarioNeto() {
        return sueldoMensual - deduccionesTotales;
    }

    @Override
    public String getInformacion() {
        return "EMPLEADO POR SUELDO \n"
                + "NOMBRE: " + getNombre() + "\n" + "APELLIDO: " + getApellido() + "\n"
                + "NUMERO SEGURIDAD SOCIAL: " + getNumeroSeguridadSocial() + "\n"
                + "SALARIO BASE:" + sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public double getRetencionFuente() {
        return retencionFuente;
    }

    public double getFondoSolidaridad() {
        return fondoSolidaridad;
    }

    public double getPagoSalud() {
        return pagoSalud;
    }

    public double getPagoPension() {
        return pagoPension;
    }
    
    
    
}
