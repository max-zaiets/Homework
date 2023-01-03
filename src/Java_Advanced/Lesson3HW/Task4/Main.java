package Java_Advanced.Lesson3HW.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File path = new File("D:\\JavaRush\\ITVDN stuff\\src\\Java_Advanced\\Lesson3HW\\Task4");

        File a = new File(path,"sample.txt");
        try {
            FileWriter fw = new FileWriter(a);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write("Once upon a time....");
            bf.flush();
            bf.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(a);
            BufferedReader br = new BufferedReader(fr);
            int c;
            while((c = br.read()) != -1){
                System.out.print((char)c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
