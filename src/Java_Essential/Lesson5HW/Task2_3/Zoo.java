package Java_Essential.Lesson5HW.Task2_3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {


    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add(0,"Lion");
        animals.add(1,"Monkey");
        animals.add(2,"Zebra");
        animals.add(3,"Eagle");
        animals.add(4,"Elephant");
        animals.add(5,"Beaver");
        animals.add(6,"Goat");
        animals.add(7,"Rhino");

        for (String a:
             animals) {
            System.out.println(a);
        }

        System.out.println("------------TASK 3---------------");
        //невозможно последовательно удалить элементы с индексами 3,5,7 так как после удаления первых двух элементов list size будет равен 6, следовательно будет OutOfBounds exception
        //поэтому решил удалить по объектам а не индексам
        animals.remove("Zebra");
        animals.remove("Elephant");
        animals.remove("Goat");
        System.out.println(animals.size());

    }
}
