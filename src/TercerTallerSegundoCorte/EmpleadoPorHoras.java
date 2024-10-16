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
    public double calcularDeducciones(double fondoSolidaridad, double retencionFuente) {
        return fondoSolidaridad + retencionFuente;
    }

    @Override
    public double calcularSalarioNeto(double fondoSolidaridad,double retencionFuente) {
        double salarioBase = horasTrabajadas * tarifaHora;
        double deducciones = calcularDeducciones(fondoSolidaridad, retencionFuente);
        return salarioBase-deducciones;
    }

}
