package ChoiceTypes;

import java.io.*;

public class LogOut {
    String fileName = "User.txt";
    String newfileName = "NewUser.txt";

    public void logOut(String username, String password) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newfileName));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] userInfo = line.split(":");
                if (!userInfo[0].trim().equals(username) && !userInfo[1].trim().equals(password)) {
                    bufferedWriter.write(line + "\n");

                }
            }
            bufferedReader.close();
            bufferedWriter.close();

            File oldFile = new File(fileName);
            oldFile.delete();
            File newFile = new File(newfileName);
            newFile.renameTo(oldFile);
        } catch (IOException e) {
            System.out.println("Prosesde Olan Xetalar : " + e.getMessage());
        }
    }
}
