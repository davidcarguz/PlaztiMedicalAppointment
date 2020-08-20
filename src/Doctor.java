public class Doctor {
    static int id = 0;
    String name;
    String speciality;

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
}
