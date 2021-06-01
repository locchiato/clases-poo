import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese");
        System.out.print("- primer numero: ");
        int numeroEntero1 = lector.nextInt();
        System.out.print("- segundo numero: ");
        int numeroEntero2 = lector.nextInt();

        if(Calculadora.esDivisible(numeroEntero1, numeroEntero2)) {
            int resultado = numeroEntero1/numeroEntero2;
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("" + numeroEntero1 + " no es divisible por " + numeroEntero2 + ".");
        }
    }

    static boolean esDivisible(int n, int divisor) {
        return n % divisor == 0;
    }
}