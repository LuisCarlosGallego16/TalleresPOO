package TercerTallerSegundoCorte;

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
    @Override
    public double calcularSalarioNeto(){
        double salarioMensual = sueldoMensual + bonoMensual;
        double salarioNeto = salarioMensual - calcularDeducciones();
            return salarioNeto;
    }
    
   @Override
   public String getInformacion(){
               return "EMPLEADO GERENTE \n"
                + "NOMBRE: " + nombre + "\n" + "APELLIDO: " + apellido + "\n"
                + "NUMERO SEGURIDAD SOCIAL: " + numeroSeguridadSocial + "\n"
                + "BONO MENSUAL: "+bonoMensual + "\n"      
                + "SALARIO MENSUAL:" + sueldoMensual;
   }
}
