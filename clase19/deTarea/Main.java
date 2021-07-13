package clase19.deTarea;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProductoFactory factory = ProductoFactory.getInstance();
        Almacen almacen = new Almacen();

        almacen.agregarProducto(
                factory.crearProducto("CAJA10X10")
        );
        almacen.agregarProducto(
                factory.crearProducto("pelotafutbol")
        );
        almacen.agregarProducto(
                factory.crearProducto("PeLoTaTeNiS")
        );

        for (Producto producto :
                almacen.getProductos()) {
            System.out.println(producto);
        }

    }

}
