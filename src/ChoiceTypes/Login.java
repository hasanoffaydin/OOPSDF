package ChoiceTypes;

import BankWorks.BankCustomer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login { // Login prosesidir sonda logout prosesi var onunla birlikde logout ede bilir
    String fileName = "User.txt";
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Istifadeci adinizi daxil edin -> ");
        String username = scanner.nextLine();
        System.out.print("Parolunuzu daxil edin -> ");
        String password = scanner.nextLine();

        boolean loginSuccessful = false;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] userInfo = line.split(":");
                if (userInfo[0].trim().equals(username) && userInfo[1].trim().equals(password)) {
                    loginSuccessful = true;
                    break;
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Prosesde Olan Xetalar : " + e.getMessage());
        }
        if (loginSuccessful) {
            System.out.println("Girisiniz Ugurla Basa Catdi");
            BankCustomer bankCustomer = new BankCustomer();
            bankCustomer.bankCustomer();
        } else {
            System.out.println("Istifadeci adiniz ve ya parolunuz sehvdir Qeydiyyat olunmayibsa Qeydiyyatdan Kecmelisiniz");
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Siz artiq proqramdan cixdiniz LogOut ede bilersiz :) \n");
        System.out.println("Siz Eger Isifadenizi Baglamaq isteseniz 0 duymesinde basin ");
        int secim = scanner1.nextInt();

        if(secim == 0) {
            System.out.println("Program dayandirilir...");
            LogOut logOut = new LogOut();
            logOut.logOut(username,password);
        } else {
            System.out.println("Sistemde isinize davam ede bilersiz");
        }

    }
}
