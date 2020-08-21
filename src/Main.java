import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Hernesto Martinez", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(),  "2pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");

        for (Doctor.AvailablAppointment availablAppointment : myDoctor.getAvailableAppointments()){
            System.out.println(availablAppointment.getDate()+" "+availablAppointment.getTime());
        }


        Patient patient = new Patient("ALejandra", "ale@email.com");

    }
}