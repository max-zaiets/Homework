package Java_Essential.Lesson1HW.Task3;

public class Book {

    private String bookName;
    private String authorName;
    private String content;
    private String title;

    public Book(){

    }

    public Book(String bookName){
        this.bookName = bookName;
    }

    public Book(String bookName, String authorName, String content, String title) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.content = content;
        this.title = title;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void show(){
        System.out.println("Book name: " + this.bookName);
        System.out.println("Author name: " + this.authorName);
        System.out.println("Content of the book: " + this.content);
        System.out.println("Title of the book: " + this.title);
    }

    public static void main(String[] args) {
        Book book = new Book("Some book");
        Author author = new Author("Some author");
        Content content = new Content("Some text");
        Title title = new Title("Some title");

        book.setBookName(book.getBookName());
        book.setAuthorName(author.getAuthorName());
        book.setContent(content.getText());
        book.setTitle(title.getTitle());
        book.show();
    }
}
