package clase13;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // todo para entrar a las opciones rapidas: Alt + Enter
        // todo la razon: porque
        // todo el que defiende tambien ataca.

        Tanque tanque = new Tanque(100);
        // esto si funciona xdd
        tanque.mostrar();


        Luchador luchador1 = new Tanque(100);
        Luchador luchador2 = new RobotLiviano(100);
        Luchador luchador3 = new RobotPesado(100);

        // pero si lo intento sin castear no

        List luchadores = new ArrayList<Luchador>(3);

        luchadores.add(luchador1);
        luchadores.add(luchador2);
        luchadores.add(luchador3);

        luchadores.forEach(luchador -> {
            ((SistemaArmas) luchador).mostrar();
        });
    }
}
