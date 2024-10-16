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
      /*  Empleado empleado1 = new Empleado("Luis","Gallego","1054857310",1245000);
        double salarioDevengadoEmpleado = empleado1.calcularDevengado();
        double calcularDeduccionesEmpleado = empleado1.calcularDeducciones(42000,60000);
        double salarioTotalEmpleado = empleado1.calcularSalarioNeto(42000,60000, 1245000);
        System.out.println(empleado1.getInformacion());
        System.out.println("Salario Devengado Empleado: "+salarioDevengadoEmpleado+"\n");
        System.out.println("Deducciones Totales Empleado: "+calcularDeduccionesEmpleado+"\n");
        System.out.println("Salario Total Empleado: " + salarioTotalEmpleado+"\n");
        */
        
        EmpleadoPorHoras empleadoHora1 = new EmpleadoPorHoras(3, 54000,20000,12000, "Pedro", "Lopez","19304651",0); //El salario base seria 0, ya que trabaja por horas.
        System.out.println(empleadoHora1.getInformacion());
        System.out.println("SALARIO DEVENGADO: "+empleadoHora1.calcularDevengado()+"\n");
        System.out.println("DEDUCCIONES TOTALES EMPLEADO: "+empleadoHora1.calcularDeducciones(20000, 12000)+"\n");
        System.out.println("SALARIO TOTAL EMPLEADO: "+empleadoHora1.calcularSalarioNeto(20000, 12000)+"\n");
        
    }
}
