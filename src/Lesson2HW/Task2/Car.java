package Lesson2HW.Task2;

public class Car {
    private int year;
    private String color;

    public Car() {
    }

    public Car(int year){
        this.year = year;
        color = "black";
    }

    public Car(int year, String color){
        this.color = color;
        year = 2022;
    }
}
