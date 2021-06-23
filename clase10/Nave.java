package clase10;

public class Nave extends Objeto{

    private double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, double velocidad) {
        super(x, y, direccion);
        this.velocidad = velocidad;
        this.vida = 150;
    }

    @Override
    public void irA(int x, int y, char direccion) {

    }

    public void girar(char direccion) {
        setDireccion(direccion);
    }

    public void restarVida(int valor) {
        this.vida -= valor;
    }

}
