package clase9;

public abstract class Medico {

    private Integer nroMatricula;
    private String nombre;

    static final Double IMP_BASIC = 15000.0;

public Medico(Integer nroMatricula, String nombre) {
        this.nroMatricula = nroMatricula;
        this.nombre = nombre;
        }

    public Integer getNroMatricula() {
        return nroMatricula;
    }

    public String getNombre() {
        return nombre;
    }
}
