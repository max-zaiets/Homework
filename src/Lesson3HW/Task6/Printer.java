package Lesson3HW.Task6;

public class Printer {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_GREEN = "\u001B[32m";

    void print(String value){
        System.out.println(ANSI_YELLOW + value + ANSI_RESET);
    }
}
