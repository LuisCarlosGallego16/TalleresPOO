package TercerTallerSegundoCorte;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;
    private double fondoSolidaridad;
    private double retencionFuente;

    public EmpleadoPorHoras(int horasTrabajadas, double tarifaHora, double fondoSolidaridad, double retencionFuente, String nombre, String apellido, String numeroSeguridadSocial, double salarioBase) {
        super(nombre, apellido, numeroSeguridadSocial, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.fondoSolidaridad = fondoSolidaridad;
        this.retencionFuente = retencionFuente;
    }

    @Override
    public double calcularDevengado() {
        double salarioDevengadoHoras = horasTrabajadas * tarifaHora;
        return salarioDevengadoHoras;
    }

    @Override
    public double calcularDeducciones() {
        double deduccionesTotales = fondoSolidaridad + retencionFuente;
        return deduccionesTotales;
    }

    @Override
    public double calcularSalarioNeto() {
        double salarioBase = horasTrabajadas * tarifaHora;
        double deducciones = fondoSolidaridad + retencionFuente;
        double salarioNetoTotal = salarioBase - deducciones;
        return salarioNetoTotal;
                    
    }
    @Override
    public String getInformacion(){
               return "EMPLEADO POR HORA \n"
                + "NOMBRE: " + getNombre() + "\n" + "APELLIDO: " + getApellido() + "\n"
                + "NUMERO SEGURIDAD SOCIAL: " + getNumeroSeguridadSocial() + "\n"
                + "SALARIO BASE:" + getSalarioBase();
    }
}
