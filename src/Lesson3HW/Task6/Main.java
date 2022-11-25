package Lesson3HW.Task6;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        printer1.print("whats up");

        GreenPrinter printer2 = new GreenPrinter();
        printer2.print("how you doin");

        Printer printer3 = new GreenPrinter();
        printer2.print("howdy");

        GreenPrinter printer4 = (GreenPrinter) printer3;
        printer2.print("long time no see");

    }
}
