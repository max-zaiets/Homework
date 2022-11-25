package Lesson3HW.Task6;

public class GreenPrinter extends Printer{ // example-test class

    void print(String value){
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}
