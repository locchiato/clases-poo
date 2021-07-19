package clase20.deTareaCarrito;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito(12);

        mostrarClase(carrito);
        do {
            carrito.pasarAlEstadoSiguiente();
            mostrarClase(carrito);
        } while (carrito.getEstadoActual() instanceof Cerrado == false);

    }

    private static void mostrarClase(Carrito carrito) {
        String [] partes = carrito.getEstadoActual().getClass().toString().split("\\.");
        System.out.println(partes[partes.length -1]);
    }
}
