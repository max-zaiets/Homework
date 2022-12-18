package Java_Essential.Lesson6HW.Task4;

public class Main {
    public static void main(String[] args) {
        Vehicles veh = Vehicles.AUDI;
        veh.colour = "black";


        System.out.println(veh.getColour());
        System.out.println(veh);

    }
}
