package clase19.enClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el numero del que desee obtener su HashCode: ");
        Integer numero = null;
        do {

            try {
                numero = in.nextInt();
                System.out.println("mumero: " + numero);
            } catch (Exception e) {
                System.out.println("error: " + e.getMessage() + " . . . " + e.getCause());
            }
        } while(numero == null);

        String expresion = "";
        try {
            expresion = numero.toString();
        }catch(Exception e){
            System.out.println("No se pudo convertir a string..." +  e.getMessage());
        }

        System.out.println("El HashCode obtenido en formato Integer es: " + (numero).hashCode());
        System.out.println("El HashCode obtenido en formato String es: " + (expresion).hashCode());
    }
}
