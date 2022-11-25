package Lesson3HW.Task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes GLS");
        Plane plane = new Plane(10000, 200);
        Ship ship = new Ship(800, "New Heaven");

        car.showCarInfo();
        plane.showPlaneInfo();
        ship.showShipInfo();

        //Vehicle - parent
        //Car - subclass

        Vehicle veh = new Car("awdawd");
        System.out.println(car.getModel());

    }
}
