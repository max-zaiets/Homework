package Lesson7HW.Task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введіть число номер 1: ");
            int a = sc.nextInt();
            System.out.println("Введіть число номер 2: ");
            int b = sc.nextInt();

            System.out.println("Введіть назву операції: ");

            String operation = sc.next();

                switch (operation) {
                    case "add":
                        System.out.println(Calculator.add(a, b));
                        break;
                    case "sub":
                        System.out.println(Calculator.sub(a, b));
                        break;
                    case "mul":
                        System.out.println(Calculator.mul(a, b));
                        break;
                    case "div":
                        System.out.println(Calculator.div(a, b));
                        break;
                }

        }catch(InputMismatchException e) {
                System.out.println("Entered value is not a number");
                System.exit(0);
        }
    }
}
