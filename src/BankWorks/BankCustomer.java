package BankWorks;

import java.util.Random;
import java.util.Scanner;

public class BankCustomer {
    public int bankCustomer() {
        Random random = new Random();
        int randomNumber = random.nextInt(9000) + 1000;
        int randomNumber1 = random.nextInt(9000) + 1000;
        int randomNumber2 = random.nextInt(9000) + 1000;
        int randomNumber3 = random.nextInt(9000) + 1000;
        System.out.println("Artiq Siz Bizim Bankimizdan Qeydiyyatdan Kecmisiniz");
        System.out.println("Sizin kart kodunu : " + randomNumber + " " + randomNumber1 + " " + randomNumber2
                + " " + randomNumber3);
        int kartMeblegi = random.nextInt(900) + 100;
        while (true) {
            System.out.println("Sizin Kartinizda Olan Mebleg : " + kartMeblegi);
            System.out.println("1)Kart balansini artimaq\n");
            System.out.println("2)Kart balansindan pul cekmek \n");
            System.out.println("3)Sistemden Cixis :)");
            System.out.println("Kart Odenisleri ile bagli seciminizi edin - > ");

            Scanner scanner = new Scanner(System.in);
            int secim = scanner.nextInt(); // Capture user choice
            if (secim == 1) {
                System.out.println("Daxil etdiiniz meblegi daxil edin: ");
                int elaveEdilen = scanner.nextInt(); // Capture amount to add
                kartMeblegi += elaveEdilen;
                System.out.println("Kartinizda olan Mebleg : " + kartMeblegi);
            } else if (secim == 2) {
                System.out.println("Xaric etdiyiniz meblegi daxil edin: ");
                int xaricEdilen = scanner.nextInt(); // Capture amount to withdraw
                kartMeblegi -= xaricEdilen;
                System.out.println("Kartinizda olan Mebleg : " + kartMeblegi);
            } else {
                return 0;
            }
        }
    }
}
