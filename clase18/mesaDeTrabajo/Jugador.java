package clase18.mesaDeTrabajo;

public class Jugador {

    private String apellido;
    private int nroCamiseta;
    private String posicion;

    public Jugador(String apellido, int nroCamiseta, String posicion) {
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
        this.posicion = posicion;
    }

    public Jugador(){
        this.apellido = "";
        this.nroCamiseta = 0;
        this.posicion = "";
    }

    public String getApellido() {
        return apellido;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public Jugador setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public Jugador setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
        return this;
    }

    public Jugador setPosicion(String posicion) {
        this.posicion = posicion;
        return this;
    }
}
