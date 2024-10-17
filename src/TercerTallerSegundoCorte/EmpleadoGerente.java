/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerTallerSegundoCorte;

/**
 *
 * @author luisc
 */
public class EmpleadoGerente extends EmpleadoPorSueldo{
    private double bonoMensual;
    private double impuestoRiqueza;


    
    public EmpleadoGerente(String nombre, String apellido, String numeroSeguridadSocial, double salarioBase,double bonoMensual, double impuestoRiqueza, double sueldoMensual, double retencionFuente, double fondoSolidaridad, double pagoSalud, double pagoPension) {
        super(sueldoMensual, retencionFuente, fondoSolidaridad, pagoSalud, pagoPension, nombre, apellido, numeroSeguridadSocial, salarioBase);
        this.bonoMensual = bonoMensual;
        this.impuestoRiqueza = impuestoRiqueza;
    }
    @Override
    public double calcularDevengado(){
        return sueldoMensual;
    }
    @Override
    public double calcularDeducciones(){
    //VARIABLES PARA REALIZAR OPERACIONES SOBRE LAS DEDUCCIONES DE IMPUESTO Y LEGALES DEL EMPLEADO
    double deduccionImpuesto = sueldoMensual* impuestoRiqueza;
    double deduccionesLegales = retencionFuente + fondoSolidaridad + pagoSalud + pagoPension + deduccionImpuesto;
        return deduccionesLegales;
    }
    
    
    
}
