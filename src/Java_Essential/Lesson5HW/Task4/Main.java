package Java_Essential.Lesson5HW.Task4;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(12);
        list.add(1);
        list.add(7);
        list.add(8);


        for (ListIterator<Integer> it = list.listIterator(); it.hasNext();) {
            Integer i = it.next();//я так понял, что каждый раз при вызове метода .next(), курсор сразу же перемещается на 1 индекс вперед? Было довольно неочевидно)
            list.set(it.previousIndex(), i+1);
        }

        for (Integer i :
             list) {
            System.out.println(i);
        }
    }
}
