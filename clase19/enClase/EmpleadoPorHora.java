package clase19.enClase;

public class EmpleadoPorHora extends Empleado{

    private Double importePorHora;
    private Integer horasTrabajadas;

    public EmpleadoPorHora(String nombre, String apellido, Integer legajo, Double importePorHora, Integer horasTrabajadas) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public Double calcularSueldo() {
        return horasTrabajadas * importePorHora;
    }

    public void cargarHoras(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
