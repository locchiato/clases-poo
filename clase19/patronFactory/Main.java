package clase19.patronFactory;

public class Main {

    public static void main(String[] args) {

        Factura f1= FactoryFacturas.getFactura("iva");
        f1.setId(1);
        f1.setImporte(100);
        System.out.println("Importe f1: " + f1.getImporteIva());


        Factura f2= FactoryFacturas.getFactura("ivareducido");
        f2.setId(1);
        f2.setImporte(100);
        System.out.println("Importe f2: " + f2.getImporteIva());


    }
}
