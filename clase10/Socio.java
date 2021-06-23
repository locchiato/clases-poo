package clase10;

import java.util.Objects;

public class Socio {

    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numeroSocio, String nombre, Double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    //equels
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Socio socio = (Socio) obj;
        return Objects.equals(this.numeroSocio, socio.numeroSocio) &&
                Objects.equals(this.nombre, socio.nombre);
    }
    
    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(this.numeroSocio, this.nombre);
    }

    public Double cuotaMensual() {
        return cuotaMensual;
    }
}
