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
       
       //EMPLEADO
        Empleado empleado1 = new Empleado("Luis", "Gallego", "1054857310", 1245000);
        double salarioDevengadoEmpleado = empleado1.calcularDevengado();
        double calcularDeduccionesEmpleado = empleado1.calcularDeducciones();
        double salarioTotalEmpleado = empleado1.calcularSalarioNeto();
        System.out.println(empleado1.getInformacion());
        System.out.println("Salario Devengado Empleado: " + salarioDevengadoEmpleado + "\n");
        System.out.println("Deducciones Totales Empleado: " + calcularDeduccionesEmpleado + "\n");
        System.out.println("Salario Total Empleado: " + salarioTotalEmpleado + "\n");

        //EMPLEADO POR HORAS
        EmpleadoPorHoras empleadoHora1 = new EmpleadoPorHoras(3, 54000, 20000, 12000, "Pedro", "Lopez", "19304651", 0); //El salario base seria 0, ya que trabaja por horas.
        System.out.println(empleadoHora1.getInformacion());
        System.out.println("SALARIO DEVENGADO: " + empleadoHora1.calcularDevengado() + "\n");
        System.out.println("DEDUCCIONES TOTALES EMPLEADO: " + empleadoHora1.calcularDeducciones());
        System.out.println("SALARIO TOTAL EMPLEADO: " + empleadoHora1.calcularSalarioNeto());
        
        //EMPLEADO POR SUELDO
        EmpleadoPorSueldo empleadoSueldo1 = new EmpleadoPorSueldo(3000000,150000,40000,60000,80000,"Jeronimo","Morales","106487982",0);
        System.out.println(empleadoSueldo1.getInformacion());
        System.out.println("SALARIO DEVENGADO MENSUAL: "+empleadoSueldo1.calcularDevengado()+"\n");
        System.out.println("DEDUCCIONES TOTALES MENSUALES: "+empleadoSueldo1.calcularDeducciones());
        System.out.println("SALARIO TOTAL EMPLEADO: "+empleadoSueldo1.calcularSalarioNeto());
        
      
        //EMPLEADO GERENTE
        EmpleadoGerente empleadoGerente1 = new EmpleadoGerente("Juan","Giraldo","106058745",0,1000000,0.15,3000000,100000,80000,90000,120000);
        
        
        
        
        
        
            
        }   
    }
