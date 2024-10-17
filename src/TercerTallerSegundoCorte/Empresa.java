
package TercerTallerSegundoCorte;

import java.util.ArrayList;
public class Empresa {
    protected ArrayList<Empleado>empleados;
    
    public Empresa(){
        empleados = new ArrayList<>();
    }
    
    

    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public double calcularNominaEmpleado(Empleado empleado){
        return empleado.calcularSalarioNeto();
    }
    
}
