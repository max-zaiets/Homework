package Lesson3HW.Task3;

public class Vehicle {
    protected double price;
    protected double speed;
    protected int year;
    protected String coordinates;


    public void showInfo(){
        System.out.println(
                "Price: " + price + "\n" +
                "Speed: " + speed + "\n" +
                "Year: " + year + "\n" +
                "Location: " + coordinates);
    }
}
