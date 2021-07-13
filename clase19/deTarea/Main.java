package clase19.deTarea;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProductoFactory factory = ProductoFactory.getInstance();

        List<Producto> products = new ArrayList<>();

        products.add(
                factory.crearProducto("CAJA10X10")
        );
        products.add(
                factory.crearProducto("pelotafutbol")
        );
        products.add(
                factory.crearProducto("PeLoTaTeNiS")
        );

        for (Producto producto :
                products) {
            System.out.println(producto);
        }

    }

}
