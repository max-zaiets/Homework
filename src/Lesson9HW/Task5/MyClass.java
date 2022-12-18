package Lesson9HW.Task5;

public class MyClass<T> {
    public T field;

    public MyClass() {
    }

    public MyClass(T field) {
        this.field = field;
    }

    public static <T> MyClass <T> factoryMethod() {
        return new MyClass<>();
    }

    public static <T> MyClass<T> factoryMethod(T arg) {
        return new MyClass<>(arg);
    }
}
