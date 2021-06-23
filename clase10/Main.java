package clase10;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Socio socio1 = new Socio("123", "Lea", 1000.0 ,"Gaming");
        Socio socio2 = new Socio("123", "Lea", 1000.0 ,"Gaming");
        if(Objects.equals(socio1.hashCode(), socio2.hashCode()))
            System.out.println("Son iguales.");
    }

}
