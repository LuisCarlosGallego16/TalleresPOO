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

    public EmpleadoPorSueldo(double sueldoMensual, double retencionFuente, double fondoSolidaridad, double pagoSalud, double pagoPension, String nombre, String apellido, String numeroSeguridadSocial, double salarioBase) {
        super(nombre, apellido, numeroSeguridadSocial, salarioBase);
        this.sueldoMensual = sueldoMensual;
        this.retencionFuente = retencionFuente;
        this.fondoSolidaridad = fondoSolidaridad;
        this.pagoSalud = pagoSalud;
        this.pagoPension = pagoPension;
    }

}




