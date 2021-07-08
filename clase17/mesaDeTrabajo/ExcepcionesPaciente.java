package clase17.mesaDeTrabajo;

public class ExcepcionesPaciente extends Exception{

    public ExcepcionesPaciente(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "ExcepcionesPaciente{" +
                "Mensaje ='" + this.getMessage() + '\'' +
                '}';
    }
}
