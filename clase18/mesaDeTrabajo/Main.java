package clase18.mesaDeTrabajo;

public class Main {

    public static void main(String[] args) {
        Jugador messi = new Jugador();
        messi.setApellido("MESSI");
        messi.setNroCamiseta(10);
        messi.setPosicion("MEDIOCAMPISTA");

        Jugador martinez = new Jugador();
        messi.setApellido("MARTINEZ");
        messi.setNroCamiseta(23);
        messi.setPosicion("ARQUERO");

        Seleccion argentina = new Seleccion("ARGENTINA");

        argentina.agregar(messi);
        argentina.agregar(martinez);


        int cant = 0;

        try{
            cant = argentina.cantJugadores("MEDIOCAMPISTA");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
