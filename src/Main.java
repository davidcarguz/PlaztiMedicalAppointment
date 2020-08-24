import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Hernesto Martinez", "doctor@gmail.com");
        myDoctor.addAvailableAppointment("24/08/2020", "4pm");
        myDoctor.addAvailableAppointment("24/08/2020",  "2pm");
        myDoctor.addAvailableAppointment("24/08/2020", "6pm");
        myDoctor.showDataUser();


        for (Doctor.AvailablAppointment availablAppointment : myDoctor.getAvailableAppointments()){
            System.out.println(availablAppointment.getDate()+" "+availablAppointment.getTime());
        }

        System.out.println(myDoctor);

        Patient patient = new Patient("ALejandra", "ale@email.com");
        System.out.println(patient);
        patient.showDataUser();

        //Ejemplo clase anonima.
        User user1 = new User("Sofia Lopez","sofil@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor:\n");
                System.out.println("Empleado Hospital: Cruz Verde\nDepartamento: Geriatria");
            }
        };
        user1.showDataUser();

    }
}