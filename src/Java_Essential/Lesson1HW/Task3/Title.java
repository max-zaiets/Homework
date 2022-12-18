package Java_Essential.Lesson1HW.Task3;

public class Title {

    private String title;

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void show(){
        System.out.println(this.title);
    }
}
