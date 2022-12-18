package Java_Essential.Lesson2HW.Task3;

public class Car {

    private int year;
    private String color;
    private double speed;
    private int weight;

    public Car() {
        year = 1998;
        color = "black";
        speed = 200.00;
        weight = 1000;
    }

    public Car(int year){
        this.year = year;
        color = "black";
        speed = 200.00;
        weight = 1000;
    }

    public Car(int year, String color){
        this.year = year;
        this.color = color;
        speed = 200.00;
        weight = 1000;
    }

    public Car(int year, String color, double speed){
        this.year = year;
        this.color = color;
        this.speed = speed;
        weight = 1000;
    }

    public Car(int year, String color, double speed, int weight) {
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }
}
