package clase7;

import java.util.Scanner;

/* ejercicio 1 y 2:
    piedra, papel, tijera o spock.
*/

public class Main {

    static private Scanner scanner = new Scanner(System.in);
    static private Integer pointsGamer1 = 0;
    static private Integer pointsGamer2 = 0;
    static private String optionGamer1 = "";
    static private String optionGamer2 = "";
    static private String nickGamer1 = "";
    static private String nickGamer2 = "";

    public static void main(String[] args) {

        ingresarUsuarios();
        jugar();

        while (optionGamer1 != "*" && optionGamer2 != "*" && optionGamer1 != "" && optionGamer2 != "") {
            Integer quienGano = cualGana(Integer.parseInt(optionGamer1), Integer.parseInt(optionGamer2));

            mostrarQuienGanoElTurno(quienGano);
            jugar();
        }

        if(pointsGamer1 != 0 || pointsGamer2 != 0)
        mostrarQuienGanoLaPartida();
    }

    private static void ingresarUsuarios() {
        System.out.print("Ingrese el nick del usuario 1: ");
        nickGamer1 = scanner.nextLine();
        System.out.print("Ingrese el nick del usuario 2: ");
        nickGamer2 = scanner.nextLine();
        System.out.println();
    }

    private static void jugar() {
        do {
            optionGamer1 = obtenerOpcion(nickGamer1);
            if(optionGamer1.compareTo("*") != 0) {
                optionGamer2 = obtenerOpcion(nickGamer2);
            }
        } while (optionGamer1.compareTo("*") == 0 || optionGamer2.compareTo("*") == 0);
    }

    private static String obtenerOpcion(String nick) {
        System.out.print("Es el turno de " + nick + ", elige un número (1-Piedra, 2-Papel, 3-Tijera, 4-Spock) o * para salir: ");
        String entrada = scanner.nextLine();

        while(!estaCadenaEsUnEntero(entrada, 5) && entrada.compareTo("*") != 0) {
            System.out.println("Opcion incorrecta.");
            System.out.println();

            System.out.print("Es el turno de " + nick + ", elige un número (1-Piedra, 2-Papel, 3-Tijera, 4-Spock) o * para salir: ");
            entrada = scanner.nextLine();
        }

        return entrada;
    }

    public static boolean estaCadenaEsUnEntero(String cadenaACheckear, int radix) {
        Scanner sc = new Scanner(cadenaACheckear.trim());
        if (!sc.hasNextInt(radix)) return false;
        sc.nextInt(radix);
        return !sc.hasNext();
    }

    public static Integer cualGana(Integer op1, Integer op2) {
        Integer resultado = 0;

        if (op1 == op2) {
            resultado = 0;
        }
        if ((op1 == 1 && op2 == 3) ||
                (op1 == 2 && op2 == 4) ||
                (op1 == 3 && op2 == 2) ||
                (op1 == 4 && op2 == 1) ||
                (op1 == 4 && op2 == 3)) {
            resultado = 1;
        }
        if ((op1 == 3 && op2 == 1) ||
                (op1 == 4 && op2 == 2) ||
                (op1 == 1 && op2 == 2) ||
                (op1 == 2 && op2 == 3) ||
                (op1 == 1 && op2 == 4) ||
                (op1 == 3 && op2 == 4)) {
            resultado = 2;
        }

        return resultado;
    }

    private static void mostrarQuienGanoElTurno(Integer quienGano) {
        if (quienGano == 1) {
            pointsGamer1++;
            System.out.println("EL ganador de esta ronda es " + nickGamer1 + ".");
        } else if (quienGano == 2) {
            pointsGamer2++;
            System.out.println("EL ganador de esta ronda es " + nickGamer2 + ".");
        } else {
            System.out.println("La ronda termino en empate.");
        }
        System.out.println();
    }

    private static void mostrarQuienGanoLaPartida() {
        if (pointsGamer1 == pointsGamer2) {
            System.out.println("La partida termino en empate.");
        } else if (pointsGamer1 > pointsGamer2) {
            System.out.println("EL ganador de esta partida es " + nickGamer1 + ".");
        } else {
            System.out.println("EL ganador de esta partida es " + nickGamer2 + ".");
        }
    }
}