package world;
import java.io.*;
import java.util.Scanner;

public class FileExample {

    public static void f1() throws IOException {
        FileOutputStream fout;
        fout = new FileOutputStream("E:/JAVA/Java Programs/Live  Programs/29_Threading/files/myData.txt",true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your company name");
        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            fout.write(name.charAt(i));
        }

        fout.close(); // Close the stream after writing all characters
        System.out.println("Data Stored in File");
    }

}
