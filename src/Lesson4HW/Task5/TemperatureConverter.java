package Lesson4HW.Task5;

public class TemperatureConverter {

    public void convert(double temp, String unitName){
        switch (unitName){
            case "Kelvin":
                System.out.println("Celsius = " + temp + "\nKelvin = " + (temp + 273.15));
                break;
            case "Fahrenheit":
                System.out.println("Celsius = " + temp + "\nFahrenheit = " + temp*1.8+32);
                break;
            default:
                System.out.println("Неизвестная ед.измерения");
        }
    }
}
