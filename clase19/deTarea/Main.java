package clase19.deTarea;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProductoFactory factory = new ProductoFactory();
        Almacen almacen = new Almacen();

        Producto caja = factory.crearProducto("CAJA10X10");
        System.out.println(caja.calcularEspacio());

        almacen.agregarProducto(caja);

        Producto pelota1 = factory.crearProducto("pelotafutbol");
        System.out.println(pelota1.calcularEspacio());

        almacen.agregarProducto(pelota1);

        Producto pelota2 = factory.crearProducto("PeLoTaTeNiS");

        almacen.agregarProducto(pelota2);

        List<Producto> productos =
                almacen.getProductos();

        System.out.println();

        for (Producto producto : productos) {
            System.out.println(producto);
        }

       // if( "aca".compareToIgnoreCase("AcA") == 0 ? false : false ) System.out.println("entró");

        System.out.println();
        System.out.println("El espacio necesario en el almacen es de: " +
                almacen.calcularEspacioNecesario() + " cm2.");

    }


}
