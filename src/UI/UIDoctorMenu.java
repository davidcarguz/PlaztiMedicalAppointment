package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+UIMenu.doctorLogged.getName());
            System.out.println("1. Add available Appointment");
            System.out.println("2. My Schedule");
            System.out.println("3. Logout");
            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmensMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
            }


        }while(response != 0);
    }

    private static void showAddAvailableAppointmensMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println(":: Add available appointment");
            System.out.println(":: Select a month");

            for(int i = 0; i<3; i++){
                int j = i+1;
                System.out.println(j+". "+UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());
            if(response > 0 && response < 4){
                int monthSelected = response-1;
                System.out.println(monthSelected+". "+UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available: [d/mm/yyyy]");
                String date = scanner.nextLine();
                System.out.println("Your date is: "+date+" \n1. Correct\n2. Change date");
                int responseDate = Integer.valueOf(scanner.nextLine());
                if(responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the time available for the date: "+date+" [16:00]");
                    time = scanner.nextLine();
                    System.out.println("Your time is: "+time+" \n1. Correct\n2. Change time");
                }while(responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            }else if(response == 0){
                showDoctorMenu();
            }

        }while(response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if(doctor.getAvailableAppointments().size()>0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }

}
