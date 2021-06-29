package clase12;

import java.util.Scanner;

public class CuentaComitente extends Cuenta {

    private String claveValidacion;
    private Scanner scanner = new Scanner(System.in);
    // ctrl + space -> para importar

    @Override
    public void extraer(double monto) {
        // o puedo verificarlo aca dentro
        Double saldoActual = informarSaldo();
        String claveIngresada;
        if(monto <= (saldoActual/2)) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Ingrese clave numerica: ");
            try{
                claveIngresada = scanner.nextLine();
                if(claveValidacion.compareToIgnoreCase(claveIngresada) == 0){
                    System.out.println("Las claves son iguales.");
                    setSaldo(getSaldo() - monto);
                }
            } catch(Exception e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        // si tengo saldo = 500;
        // y pido -> 250 -> me pide clave? -> no
        // solo me pide clave si el monto es mayor al 50% del saldo.

        // pongo clave validacion? mas de lo que tengo depositado.

    }

}
