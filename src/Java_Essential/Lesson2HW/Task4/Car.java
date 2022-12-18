package Java_Essential.Lesson2HW.Task4;

public class Car {

    private int year;
    private String color;
    private double speed;
    private int weight;

    public Car() {
        this(1995, "white", 200.59, 1000);
    }

    public Car(int year){
        this(year, "white", 200.59, 1000);
    }

    public Car(int year, String color){
        this(year, color, 200.59, 1000);
    }

    public Car(int year, String color, double speed){
        this(year, color, speed, 1000);
    }

    public Car(int year, String color, double speed, int weight) {
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }
}

