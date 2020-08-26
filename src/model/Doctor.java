package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos

    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public String getTime() {
            return time;
        }

        @Override
        public String toString() {
            return "AvailablAppointments \nDate: "+getDate()+"\nTime: "+getTime();
        }
    }

    @Override
    public String toString() {
        return "Speciality: "+speciality+"\n Available: "+availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Cruz Roja\nDepartamento: Oncologia");
    }
}
