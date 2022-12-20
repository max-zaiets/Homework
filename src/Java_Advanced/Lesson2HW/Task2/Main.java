package Java_Advanced.Lesson2HW.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        doubleValues(list);

        System.out.println(list);
    }

    public static <T> void  doubleValues(List<T> list){ // first <T> shows generic usage in method parameter (not List of some <T> class that does not exist)
        for(int i = 0; i< list.size(); i++){
            list.add(i, list.get(i));
            i++;
        }
    }
}
