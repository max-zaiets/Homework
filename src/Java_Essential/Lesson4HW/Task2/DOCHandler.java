package Java_Essential.Lesson4HW.Task2;

public class DOCHandler extends AbstractHandler{
    void  open(){
        System.out.println("DOC opened");
    }
    void create(){
        System.out.println("DOC created");
    }
    void change(){
        System.out.println("DOC changed");
    }
    void save(){
        System.out.println("DOC saved");
    }
}
