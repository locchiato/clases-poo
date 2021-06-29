package clase10;

import java.util.Objects;

public class Nave extends Objeto{

    private double velocidad;
    private int vida;


    public void girar(char direccion) {
        setDireccion(direccion);
    }

    public void restarVida(int valor) {
        this.vida -= valor;
    }

    public Nave(int x, int y, char direccion, double velocidad) {
        super(x, y, direccion);
        this.velocidad = velocidad;
        this.vida = 150;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nave)) return false;
        Nave nave = (Nave) o;
        return Double.compare(nave.velocidad, velocidad) == 0 && vida == nave.vida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidad, vida);
    }

    @Override
    public void irA(int x, int y, char direccion) {

    }
}
