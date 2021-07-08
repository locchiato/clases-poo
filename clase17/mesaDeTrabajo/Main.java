package clase17.mesaDeTrabajo;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(2012, 2, 12);

        Paciente paciente=new Paciente("Juan","Perez","12345",
                cal.getTime());

        System.out.println(paciente);
    }
}
