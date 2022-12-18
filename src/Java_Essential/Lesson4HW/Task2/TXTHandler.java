package Java_Essential.Lesson4HW.Task2;

public class TXTHandler extends AbstractHandler{
    void  open(){
        System.out.println("TXT opened");
    }
    void create(){
        System.out.println("TXT created");
    }
    void change(){
        System.out.println("TXT changed");
    }
    void save(){
        System.out.println("TXT saved");
    }
}
