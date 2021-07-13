package clase19.deTarea;

public class Caja extends Producto{

    private double longitud;
    private double ancho;
    private double altura;

    public Caja(double longitud) {
        this.longitud = longitud;
        this.ancho = longitud;
        this.altura = longitud;
    }

    @Override
    public double calcularEspacio() {
        return 0;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                ", altura=" + altura +
                '}';
    }
}
