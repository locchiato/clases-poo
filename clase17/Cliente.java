package clase17;

public class Cliente {

    private String nombre;
    private String apellido;
    private String DNI;
    private double saldoEnCuenta;
    private double limite;
    private double deuda;

    public Cliente(String nombre, String apellido, String DNI, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite = limite;
        this.saldoEnCuenta = 0.0;
        this.deuda = 0.0;
    }

    public void comprar(double importe){
        this.saldoEnCuenta -= importe;
    }

    public void saldarDeuda(double importe){
        this.deuda -= importe;
    }

    public static void main(String[] args) {
        Cliente cliente = null;
        try {
            cliente = new Cliente("Leandro", "Occhiato", "38028504", -300);

        } catch (Exception e) {
            String clase = e.getClass().toString();
            System.out.println("La clase es:" + clase);

            switch (clase) {
                case "1":
                    System.out.println("No se puede crear cliente con limite negativo.");
                    break;
                case "2":
                    System.out.println("No se puede crear cliente con limite negativo.");
                    break;
                case "3":
                    System.out.println("No se puede crear cliente con limite negativo.");
                    break;
                default:
                    System.out.println("Excepcion no manejada.");
                    System.out.println("Clase: " + clase);
                    System.out.println("Mensaje: " + e.getMessage());
            }
        }
    }
}
