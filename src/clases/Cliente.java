import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {

    private String numeroCliente;
    private String nombre;
    private Double deuda;

    public Cliente(String numero, String nombre) {
        this.numeroCliente = numero;
        this.nombre = nombre;
        this.pagarDeuda();
    }

    public void incrementarDeuda(Double valor) {
        this.deuda += valor;
        System.out.println("Se incrementa $" + valor + " a la deuda de " +
                this.nombre + " y ahora es $" + this.deuda);
    }

    public void pagarDeuda() {
        this.deuda = 0.0;
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1234", "Noe. M.L.");
        Cliente cliente2 = new Cliente("1235", "Lu. M.");
        Cliente cliente3 = new Cliente("1236", "Lina. H.");
        Cliente cliente4 = new Cliente("1237", "St. M.");
        Cliente cliente5 = new Cliente("1238", "Lea. O.");

        List<Cliente> miLista = new ArrayList<Cliente>(Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5));

        /* es lo mismo que:
        List miLista = new ArrayList<Cliente>();
        miLista.add(cliente1);
        miLista.add(cliente2);
        miLista.add(cliente3);
        miLista.add(cliente4);
        miLista.add(cliente5);
        */

        miLista.forEach(cliente -> {
            System.out.println("El cliente numero: " + cliente.getNumeroCliente());
            System.out.println("Tiene de nombre: " + cliente.getNombre());
            System.out.println("Y su deuda es de: " + cliente.getDeuda());
            cliente.incrementarDeuda(120.0);
            System.out.println("");

        });
    }


    public String getNumeroCliente() {
        return numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

}
