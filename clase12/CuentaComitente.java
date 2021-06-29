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
            setSaldo(informarSaldo() - monto);
        } else {
            System.out.println("Ingrese clave numerica: ");
            try{
                // un char es un int
                // char es 1 byte
                // int es 4 bytes
                // pero char tiene un limite esta dentro de los
                // valores aceptados por int
                // en ascii
                claveIngresada = scanner.nextLine();

                // eso es para comparar dos cadenas ignorando minuscalas y mayusculas
                // da true si:                // AGua == agUA
                if(claveValidacion.compareToIgnoreCase(claveIngresada) == 0){
                    System.out.println("Las claves son iguales.");
                    setSaldo(informarSaldo() - monto);
                }

            } catch(Exception e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }

    }

}
