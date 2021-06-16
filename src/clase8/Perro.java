package clase8;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Perro {

    private Double peso;
    private String raza;
    private String nombre;
    private int anioNacimiento;
    private boolean tieneChip;
    private boolean enAdopcion;
    private boolean estaLastimado;

    public int queEdadTiene() {
        LocalDate nacimiento = LocalDate.of(this.anioNacimiento, Month.JANUARY, 1);
        return Integer.parseInt(String.valueOf(ChronoUnit.YEARS.between(nacimiento, LocalDate.now())));
    }

    public Perro(String nombre, int anio) {
        this.nombre = nombre;
        this.anioNacimiento = anio;
    }

    public static void main(String[] args) {
        Perro perro = new Perro("Scooby", 2010);
        System.out.println("Edad de " + perro.nombre + " es " + perro.queEdadTiene());
    }

    // Para alternar lugar de las filas.
    // ALT + SHIFT + flechas.

    // Para insertar contructor
    // ALT + INSERT -> Constructor
    // seleccionar todos con SHIFT + flechas.
    public Perro(Double peso, String raza, String nombre, int anioNacimiento, boolean tieneChip, boolean enAdopcion, boolean estaLastimado) {
        this.peso = peso;
        this.raza = raza;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.tieneChip = tieneChip;
        this.enAdopcion = enAdopcion;
        this.estaLastimado = estaLastimado;
    }

    // Para insertar getters and setters
    // ALT + INSERT -> Getters and Setters
    // seleccionar todos con SHIFT + flechas.
}
