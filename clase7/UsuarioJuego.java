package clase7;

public class UsuarioJuego {

    // String

    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    // ALT + Insert podes crear muchos constructores 1 para cada
    // cantidad de parametros distintos

    public void aumentarPuntaje() {
        this.puntaje++;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void bonus(int valor) {
        this.puntaje += valor;
    }

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
