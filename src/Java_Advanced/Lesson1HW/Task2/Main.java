package Java_Advanced.Lesson1HW.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a","e","i","o","u","s","d","f","g","h");
        ListIterator<String> it = list.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
