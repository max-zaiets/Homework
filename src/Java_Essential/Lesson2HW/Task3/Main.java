package Java_Essential.Lesson2HW.Task3;

import Java_Essential.Lesson2HW.Task4.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Java_Essential.Lesson2HW.Task4.Car();
        Car car1 = new Java_Essential.Lesson2HW.Task4.Car(2006);
        Car car2 = new Java_Essential.Lesson2HW.Task4.Car(2009, "yellow");
        Car car3 = new Java_Essential.Lesson2HW.Task4.Car(2019, "pink", 215.00);
        Car car4 = new Car(2022, "black", 280.00, 1200);
    }
}
