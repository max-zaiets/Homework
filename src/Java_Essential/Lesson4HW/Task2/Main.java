package Java_Essential.Lesson4HW.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Provide the document name and extension: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        while (!name.endsWith(".doc") || !name.endsWith(".txt") || !name.endsWith(".xml")) {

            if (name.endsWith(".doc")) {
                System.out.println("Provided DOC format");
               break;
            } else if (name.endsWith(".txt")) {
                System.out.println("Provided TXT format");
                break;
            } else if (name.endsWith(".xml")) {
                System.out.println("Provided XML format");
                break;
            }

            System.out.println("Format is incorrect");
            name = sc.nextLine();
        }
    }
}
