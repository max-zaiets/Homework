package Java_Essential.Lesson9HW.Task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> a = new MyDictionary<>();
        a.put(1, "Hi");
        System.out.println(a.get(1));
        System.out.println(a.size());
        System.out.println(a);
    }
}
