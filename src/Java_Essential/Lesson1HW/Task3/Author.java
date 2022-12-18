package Java_Essential.Lesson1HW.Task3;

public class Author {

    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    void show(){
        System.out.println(this.authorName);
    }
}
