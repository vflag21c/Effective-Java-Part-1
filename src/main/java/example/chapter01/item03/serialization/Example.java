package example.chapter01.item03.serialization;

import java.io.*;

public class Example {

    private void serialize(Book book) {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
            out.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Book deserialize() {
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))) {
            return (Book) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "이펙티브");
        book.setAuthor("yeol");

        Example example = new Example();

        Book.name = "you";
        example.serialize(book);

        Book.name = "change";
        Book deserializedBook = example.deserialize();

        System.out.println(book);
        System.out.println(deserializedBook);
    }
}
