package clase19.deTarea;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public double calcularEspacioNecesario(){
        Double acumulador = 0.0;
        for(Producto producto: productos){
            acumulador += producto.calcularEspacio();
        }
        return Math.round(acumulador*100.0)/100.0;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
