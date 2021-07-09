package clase18.mesaDeTrabajo;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {

    private String nombre;
    private List<Jugador> jugadores;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregar(Jugador jugador) {
        jugadores.add(jugador);
    }

    public int cantJugadores(String posicion) {
        int contador = 0;
        for(Jugador jugador : jugadores) {
            if(jugador.getPosicion().equals(posicion)) {
                contador++;
            }
        }
        return contador;
    }
}
