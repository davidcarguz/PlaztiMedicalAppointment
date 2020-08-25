package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;
    private ArrayList<AvailablAppointment> availablAppointments = new ArrayList<>();

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
        availablAppointments.add(new AvailablAppointment(date,time));
    }

    public ArrayList<AvailablAppointment> getAvailableAppointments(){
        return availablAppointments;
    }

    public static class AvailablAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailablAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE) {
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
        return "Speciality: "+speciality+"\n Available: "+availablAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Cruz Roja\nDepartamento: Oncologia");
    }
}
