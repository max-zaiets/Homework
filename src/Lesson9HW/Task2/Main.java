package Lesson9HW.Task2;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Hi");
        System.out.println(myList.get(0));
        System.out.println(myList.size());
        System.out.println(myList);
    }
}
