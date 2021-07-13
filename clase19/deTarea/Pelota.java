package clase19.deTarea;

public class Pelota extends Producto{

    private double radio;

    public Pelota(double radio) {
        super();
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return 0;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "radio=" + radio +
                '}';
    }
}
