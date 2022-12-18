package Java_Essential.Lesson4HW.Task5;

public class KelvinConverter extends TemperatureConverter{
    public void convert(double temp){
        System.out.println("Celsius = " + temp + "\nKelvin = " + (temp + 273.15));
    }
}
