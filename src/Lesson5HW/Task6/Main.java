package Lesson5HW.Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String bestTeacher = "Nelia Aleksandrovna";
        String worstTeacher = "Liudmilla Ivanovna";

        list.add("Walentyna Ivanovna");
        list.add("Nelia Aleksandrovna");
        list.add("Lillia Nikolaevna");
        list.add("Liudmilla Ivanovna");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {

            String s = it.next();

            if(s.equals(bestTeacher)){
                System.out.println("Best teacher index: " + it.previousIndex());
            } else if(s.equals(worstTeacher)){
                System.out.println("Worst teacher index: " + it.previousIndex());
            }
        }
    }
}
