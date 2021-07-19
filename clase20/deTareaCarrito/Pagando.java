package clase20.deTareaCarrito;

public class Pagando implements Estado{

    @Override
    public Estado cancelar() {
        return new Vacio();
    }

    @Override
    public Estado getAnterior() {
        return new Cargando();
    }

    @Override
    public Estado getSiguiente() {
        return new Cerrado();
    }
}
