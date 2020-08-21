import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;

    Doctor(String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos
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
