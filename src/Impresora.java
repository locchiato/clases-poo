import java.util.Date;

public class Impresora {

    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int cantHojas;

    public static void main(String[] args) {
        Impresora epson = new Impresora("Epson");
    }

    private void imprimir(String modelo) {
        System.out.println(modelo);
    }

    public Impresora() {
        this("Sin-Modelo");
    }

    public Impresora(String modelo) {
        this.modelo = modelo;
        imprimir(this.modelo);
    }
}
