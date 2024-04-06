package Manager;

import ChoiceTypes.Login;
import ChoiceTypes.Register;

import java.util.Scanner;

public class ChoiceImpl implements Choices {
    @Override
    public void Choice() { // secimimimizi edirik
        System.out.println("---------------->Banka Xos Gelmisiniz <---------------------\n");
        System.out.println("Secimler Asagida Qeyd Olunanlardan Ibaretdir \n");
        System.out.println("1)Bank Login Metodu \n");
        System.out.println("2)Bank Register Metodu \n");
        System.out.println("Seciminizi Edin -> ");

        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();
        if (secim == 1) {
            Login login = new Login();
            login.login();
        }
        else if (secim == 2) {
            Register register  = new Register();
            register.register();
        } else {
            System.out.println("Seciminiz Dogru Deyil!");
        }
    }
}
