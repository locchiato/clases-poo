package clase19.deTarea;

public class Pelota extends Producto{

    private double radio;

    public Pelota(double radio) {
        super();
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "radio=" + radio +
                '}';
    }
}
