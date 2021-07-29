package object;

class Book implements Cloneable{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "책의 이름은 " + title + " 저자는 " + author + "입니다.";
    }
}

public class ToStringTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("토지", "박경리");

        Book book2 = (Book)book1.clone();

        System.out.println(book1.toString());
        System.out.println(book2);
    }
}
