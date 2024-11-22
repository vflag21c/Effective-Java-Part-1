package example.chapter01.item03.serialization;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 1L; // 클래스가 바뀌어도 역직렬화가 됨.

    public static String name; // static 직렬화 되지 않음

    private String title;
    private transient String author; // transient 역직렬화 되지 않음

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}' + name;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String author() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
