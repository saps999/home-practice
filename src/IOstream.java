import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOstream {
    public static void main(String[] args) {
        // code to create a new file

       /* File myFile = new File("this.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // code to write a file

        /*try {
            FileWriter fileWriter = new FileWriter("this.txt");
            fileWriter.write("Hii, I am Saptarshi.\nHave a nice day.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // reading a file

        /* File myFile = new File("this.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        // deleting file

        File myFile = new File("this.txt");
        if (myFile.delete()) {
            System.out.println("file deleted " + myFile.getName());
        } else System.out.println("Error");
    }
}
