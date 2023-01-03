package Java_Advanced.Lesson3HW.Task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File dir = new File("D:\\JavaRush\\ITVDN stuff\\src\\Java_Advanced\\Lesson3HW\\Task2");

        try {
            File myObj = new File(dir,"filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            BufferedWriter bf = new BufferedWriter(new FileWriter(myObj));
            bf.write("whats up");
            bf.flush();
            bf.close();

            BufferedReader br = new BufferedReader(new FileReader(myObj));
            String s;
            int c;
            System.out.print("File content: ");
            while ((c = br.read()) != -1) {
                System.out.print((char) c);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
