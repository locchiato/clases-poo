
public class Veterinaria {

    public static void main(String[] args) {
        String arrayNombres[] = {"Manchitas", "Nemo", "Silvestre", "Manuelita", "Gardel"};
        int arrayEdades[] = {2, 1, 3, 12, 1};
        String arrayCantidadAlimento[] = {"2 kilos y medio", "140 gramos", "medio kilo", "300 gramos", "350 gramos"};
        String arraySonidos[] = {"guau guau", "glu glu", "miau miau", "Pehuajo", "chuick chuick"};


        for (int i = 0; i < arrayEdades.length; i++) {
        mostrarDatos(arrayNombres[i], arrayEdades[i],
                    arrayCantidadAlimento[i], i==3, arraySonidos[i]);
        }
    }

    static void mostrarDatos(String nombre, int edad, String cantidad, boolean esLugar, String sonido) {

        System.out.println(nombre + " tiene " + edad + " años ");
        System.out.println(nombre + " come " + cantidad +
                (esLugar ? " y vive en " : " y hace ") + sonido);
    }


}
