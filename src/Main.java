import model.Doctor;
import model.Patient;
import model.User;
import static UI.UIMenu.showMenu;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        showMenu();

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