package clase19.patronSingleton;

public class Main {

    public static void main(String[] args) {

        Configurador c = Configurador.getInstance("https://www.google.com/", "miJson");


        System.out.println(c.getUrl());
        System.out.println(c.getBaseDatos());
    }
}
