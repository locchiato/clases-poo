package clase20.deTareaCarrito;

import java.util.*;

public class Carrito {

    private Integer id;
    private List<Producto> productos;

    public Estado getEstadoActual() {
        return estadoActual;
    }

    private Estado estadoActual;

    public Carrito(Integer id) {
        this.id = id;
        this.productos = new ArrayList<>();
        this.estadoActual = new Vacio();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void cancelarCompra(){
        this.estadoActual = this.estadoActual.cancelar();
    }

    public void volverAlEstadoAnterior(){
        this.estadoActual = this.estadoActual.getAnterior();
    }

    public void pasarAlEstadoSiguiente(){
        this.estadoActual = this.estadoActual.getSiguiente();
    }

}
