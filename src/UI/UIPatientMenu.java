package UI;

import model.Doctor;
import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome "+UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointment");
            System.out.println("3. Logout");
            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());
            switch(response) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while(response !=0);
    }
    public static void showBookAppointmentMenu() {
        int response = 0;
        do{
            System.out.println("::Book an Appointment");
            System.out.println("::Select Date:");
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for(int i = 0; i <UIDoctorMenu.doctorsAvailableAppointments.size(); i++){
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for(int j = 0; j < availableAppointments.size(); j++){
                    k++;
                    System.out.println(k+". "+availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k),doctorAppointments);
                }
            }
            Scanner scanner = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(scanner.nextLine());
            Map<Integer,Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");
            for(Map.Entry<Integer,Doctor> doc : doctorAvailableSelected.entrySet()){
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }
            System.out.println(doctorSelected.getName()
                    +". Date: "+doctorSelected.getAvailableAppointments().get(indexDate).getDate()
                    +". Time: "+doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirm your appointment: \n1. yes\n2. Change data" );
            response = Integer.valueOf(scanner.nextLine());

            if(response == 1){

            }
        }while(response !=0);
    }
}
