package Manager;

import Entity.User;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    String fileName = "User.txt";
    public void writeFile(User user) {
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.write(user.getName() + ":" + user.getPassword() + ":"
                    + user.getLastName() + ":" + user.getEmail() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File Yazarkan Xeta Bas Verdi: " + e.getMessage());
        }
    }
}
