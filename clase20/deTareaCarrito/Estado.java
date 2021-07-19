package clase20.deTareaCarrito;

public interface Estado {

    Estado cancelar();
    Estado getAnterior();
    Estado getSiguiente();

}
