import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Hernesto Martinez", "Pediatria");
        System.out.println("nombre del doctor: "+myDoctor.name);
        System.out.println("especialidad: "+myDoctor.speciality);
    }
}
