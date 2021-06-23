package clase10;

public abstract class Objeto {

    private int posx;
    private int posy;

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    private char direccion;

    public Objeto(int x, int y, char direccion) {
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    public abstract void irA(int x, int y, char direccion);

}
