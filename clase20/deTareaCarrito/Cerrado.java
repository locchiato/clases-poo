package clase20.deTareaCarrito;

public class Cerrado implements Estado{
    @Override
    public Estado cancelar() {
        return new Vacio();
    }

    @Override
    public Estado getAnterior() {
        return new Cerrado();
    }

    @Override
    public Estado getSiguiente() {
        return new Vacio();
    }
}
