package ChoiceTypes;

import Entity.User;
import Manager.WriteFile;

import java.util.Scanner;

public class Register {
    private User user = new User();
    private WriteFile writeFile = new WriteFile();

    public void register() {  //register prosesidir mueyyen sertleri var
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adinizi daxil edin (büyük harfle başlamalıdır): ");
        String name = scanner.nextLine();
        if (!name.isEmpty() && Character.isUpperCase(name.charAt(0))) {
            user.setName(name);
        } else {
            System.out.println("Ad büyük harfle başlamalıdır.");
            return;
        }

        System.out.println("Soyadinizi daxil edin (büyük harfle başlamalıdır): ");
        String lastName = scanner.nextLine();
        if (!lastName.isEmpty() && Character.isUpperCase(lastName.charAt(0))) {
            user.setLastName(lastName);
        } else {
            System.out.println("Soyad büyük harfle başlamalıdır.");
            return;
        }

        System.out.println("Emailinizi daxil edin (email formatına uygun olmalıdır): ");
        String email = scanner.nextLine();
        if (isValidEmail(email)) {
            user.setEmail(email);
        } else {
            System.out.println("Email Yazilisiniz dogru deyil!");
            return;
        }

        System.out.println("Parolunuzu daxil edin (minimum 8 karakter): ");
        String password = scanner.nextLine();
        if (password.length() >= 8) {
            user.setPassword(password);
        } else {
            System.out.println("Parola minimum 8 karakter olmalıdır.");
            return;
        }

        System.out.println("Parolunuzu tesdiqleyin");
        String checkPassword = scanner.nextLine();

        if(checkPassword.equals(user.getPassword())) {
            System.out.println("Sizin Register Prosesiniz Ugurla Basa Catdi");
            writeFile.writeFile(user);
        } else {
            System.out.println("Sizin Registerinizde problemy var");
        }
    }
    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
