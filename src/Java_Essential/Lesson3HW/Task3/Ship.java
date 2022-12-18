package Java_Essential.Lesson3HW.Task3;

public class Ship extends Vehicle{

    private int passengerCount;
    private String port;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Ship(int passengerCount, String port) {
        this.passengerCount = passengerCount;
        this.port = port;
        speed = 160;
        year = 2016;
        coordinates = "14°45'15.2\"N 2°97'36.7\"E";
    }

    public void showShipInfo(){
        super.showInfo();
        System.out.println(
                "Passengers count: " + passengerCount + "\n" +
                "Port: " + port);
    }
}
