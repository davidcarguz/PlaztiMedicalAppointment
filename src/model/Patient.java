package model;

public class Patient extends User{

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name,email);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight+" kg";
    }

    public String getHeight() {
        return this.height+" mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "\nAge: "+birthday+"\nWeight: "+getWeight()+"\nHeight: "+getHeight()+"\nBlood: "+blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja\nHistoria Clinica: 103853\nEstado: Estable");
    }
}
