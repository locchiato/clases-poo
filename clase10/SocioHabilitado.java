package clase10;

public class SocioHabilitado extends Socio {


    private boolean habilitado;
    private Double precioPileta;

    public SocioHabilitado(String numeroSocio, String nombre, Double cuotaMensual, String actividad) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.habilitado = true;
        this.precioPileta = 5000.0;
    }

    @Override
    public Double cuotaMensual() {
        return habilitado ?
                (super.cuotaMensual() - precioPileta) :
                super.cuotaMensual();
    }

}
