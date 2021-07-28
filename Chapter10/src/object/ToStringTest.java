package object;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "책의 이름은 " + title + " 저자는 " + author + "입니다.";
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Book book = new Book("토지", "박경리");

        System.out.println(book.toString());
    }
}
