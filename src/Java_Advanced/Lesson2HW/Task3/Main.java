package Java_Advanced.Lesson2HW.Task3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        List<Integer> list = MyLinkedList.getIntegerList(n);
        System.out.println("Filled list:");
        for (int temp : list) {
            System.out.println(temp);
        }
        int minElement = MyLinkedList.getMinimum(list);
        System.out.println("Minimal element of list: " + minElement);
    }
}
