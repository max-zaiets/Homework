package Java_Essential.Lesson1HW.Task4;

public class Computer {

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (Computer c:
             computers) {
            System.out.println(c);
        }



    }
}
