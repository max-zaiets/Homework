package Lesson9HW.Task5;

public class Main {
    public static void main(String[] args) {
        MyClass<String> a = new MyClass<>();
        System.out.println(MyClass.factoryMethod().getClass());
    }
}
