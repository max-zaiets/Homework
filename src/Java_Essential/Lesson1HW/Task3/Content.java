package Java_Essential.Lesson1HW.Task3;

public class Content {

    private String text;

    public Content(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    void show(){
        System.out.println(this.text);
    }
}
