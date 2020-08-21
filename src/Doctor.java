import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static int id = 0;
    private String name;
    private String speciality;

    Doctor(){
        id++;
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id doctor: "+id);
    }

    ArrayList<AvailablAppointment> availablAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availablAppointments.add(new AvailablAppointment(date,time));
    }

    public ArrayList<AvailablAppointment> getAvailableAppointments(){
        return availablAppointments;
    }

    public static class AvailablAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailablAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }
    }
}
