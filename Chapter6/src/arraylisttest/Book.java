package arraylisttest;

public class Book {
    private String bookName;
    private int bookID;

    public Book(String bookName, int bookID) {
        setBookName(bookName);
        setBookID(bookID);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}
