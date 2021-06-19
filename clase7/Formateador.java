package clase7;

import java.util.Scanner;

public class Formateador {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo: ");
        String nombre = lector.nextLine();

        String iniciales = "" + nombre.charAt(0);
        for(int i=0; i<nombre.length(); i++) {
            char letra = nombre.charAt(i);

            if(letra == ' ') {
                iniciales += ". " + nombre.charAt(i+1);
            }
        }

        System.out.println(iniciales.toUpperCase() + ".");
    }
}
