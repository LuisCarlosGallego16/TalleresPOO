/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerTallerSegundoCorte;

/**
 *
 * @author luisc
 */
public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHoras(int horasTrabajadas, double tarifaHora, String nombre, String apellido, String numeroSeguridadSocial, double salarioBase) {
        super(nombre, apellido, numeroSeguridadSocial, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
   /* @Override
    public double calcularDevengado(){
        super.calcularDevengado();
            return salarioBase;
    }
    
    @Override
    public double calcularDeducciones(){
        
    }
    @Override
    public void calcularSalarioNeto(){
        
    }
    */
    
}
