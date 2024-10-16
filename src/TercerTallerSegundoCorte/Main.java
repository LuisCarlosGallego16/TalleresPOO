/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerTallerSegundoCorte;

/**
 *
 * @author luisc
 */
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Luis","Gallego","1054857310",1245000);
        double salarioDevengadoEmpleado = empleado1.calcularDevengado();
        double calcularDeduccionesEmpleado = empleado1.calcularDeducciones(42000,60000);
        double salarioTotalEmpleado = empleado1.calcularSalarioNeto(42000,60000, 1245000);
        System.out.println(empleado1.getInformacion());
        System.out.println("Salario Devengado Empleado: "+salarioDevengadoEmpleado+"\n");
        System.out.println("Deducciones Totales Empleado: "+calcularDeduccionesEmpleado+"\n");
        System.out.println("Salario Total Empleado: " + salarioTotalEmpleado+"\n");
        
                    
    }
}
