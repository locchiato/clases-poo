package clase13;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        decirHolaMundo();

        Luchador luchador1 = new Tanque(100);
        Luchador luchador2 = new RobotLiviano(100);
        Luchador luchador3 = new RobotPesado(100);

        List luchadores = new ArrayList<Luchador>();

        luchadores.add(luchador1);
        luchadores.add(luchador2);
        luchadores.add(luchador3);

        luchadores.forEach(luchador -> {
            ((SistemaArmas) luchador).mostrar();
        });

    }

    private static void decirHolaMundo() {
        int[] numeros = {72,79,76,65,32,77,85,78,68,79,33};

        for(int num : numeros) {
            System.out.print((char) num);
        }
        System.out.println();
    }
}
