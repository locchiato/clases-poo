package clase19.patronFactory;

public class FactoryFacturas {

    public static Factura getFactura(String tipo) {
        switch(tipo.toLowerCase()) {
            case "iva": return new FacturaIva();
            case "ivareducido": return new FacturaIvaReducido();
            default:
                System.out.println("Ese tipo no existe.");
        }
        return null;
    }

}
