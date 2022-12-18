package Java_Essential.Lesson4HW.Task5;

public class FahrenheitConverter extends TemperatureConverter{
    public void convert(double temp){
        System.out.println("Celsius = " + temp + "\nFahrenheit = " + temp*1.8+32);
    }
}
