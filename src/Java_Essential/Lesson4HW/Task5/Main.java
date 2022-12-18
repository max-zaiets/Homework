package Java_Essential.Lesson4HW.Task5;

public class Main {
    public static void main(String[] args) {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();

        fahrenheitConverter.convert(100);
        kelvinConverter.convert(100);
    }
}
