package clase20.deTareaCarrito;

public class Cargando implements Estado{

    @Override
    public Estado cancelar() {
        return new Vacio();
    }

    @Override
    public Estado getAnterior() {
        return new Vacio();
    }

    @Override
    public Estado getSiguiente() {
        return new Pagando();
    }
}
