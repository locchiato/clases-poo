package clase7;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros: ");
        int numeroEntero1 = lector.nextInt();

        listarPrimos(numeroEntero1);
    }

    public static void listarPrimos(Integer cantidad) {
        int cantidadEncontrados = 0;
        int numero = 2;
        System.out.println("Los primeros " + cantidad + " numeros primos son: ");
        while(cantidadEncontrados < cantidad) {
            if(esPrimo(numero)) {
                cantidadEncontrados++;
                System.out.print(numero + ((cantidadEncontrados == cantidad) ? "." : ", "));
            }
            numero++;
        }

    }

    static boolean esDivisible(int n, int divisor) {
        return n % divisor == 0;
    }

    public static boolean esPrimo(Integer numero){
        for(int i = 2; i <= (numero/2); i++)
            if (esDivisible(numero, i)) {
                return false;
            }
        return true;
    }

}