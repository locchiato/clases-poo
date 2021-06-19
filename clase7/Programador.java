package clase7;

import java.util.Scanner;

public class Programador {

    private static String nombre = "Julieta";
    private static Integer horasSemanales = 0;
    private static Double valorHoraSemanal = 875.33;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de horas: ");
        Integer horas = 0;
        try {
           horas = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        setHorasSemanales(horas);
        informarSueldoSemanal(); // esto solo deberia informar
    }


    static void informarSueldoSemanal() {
        int horas = getHorasSemanales();
        String name = getNombre();
        Double valor = getValorHoraSemanal();
        System.out.println(name + " trabajo en la ultima semana: " +
                horas + " horas y el valor de la hora semanal es de " +
                valor + ".");

        if(horas > 40) {
            horas-=40;
            System.out.println("El sueldo de " + name + " es de: $" + (Math.floor((40*valor) + (horas * (valor * 1.5)) * 100) /100.));
        }else{
            System.out.println("El sueldo de " + name + " es de: $" + (Math.floor((horas*valor) * 100) /100.) );
        }

    }

    public static String getNombre() {
        return nombre;
    }

    public static Integer getHorasSemanales() {
        return horasSemanales;
    }

    public static Double getValorHoraSemanal() {
        return valorHoraSemanal;
    }

    public static void setNombre(String name) {
        nombre = name;
    }

    public static void setHorasSemanales(Integer horas) {
        horasSemanales = horas;
    }

    public static void setValorHoraSemanal(Double valor) {
        valorHoraSemanal = valor;
    }

}
