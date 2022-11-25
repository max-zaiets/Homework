package Lesson3HW.Task3;

public class Plane extends Vehicle{

    private double altitude;
    private int passengerCount;

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public Plane(double altitude, int passengerCount) {
        this.altitude = altitude;
        this.passengerCount = passengerCount;
        speed = 700;
        year = 2022;
        coordinates = "37°56'15.2\"N 2°22'26.5\"E";
    }

    public void showPlaneInfo(){
        super.showInfo();
        System.out.println(
                "Altitude: " + altitude + "\n" +
                "Passengers count: " + passengerCount);
    }
}
