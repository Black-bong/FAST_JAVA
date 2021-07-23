package arraylisttest;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentID;

    ArrayList<Book> bookList;

    public Student(String studentName, int studentID) {
        setStudentName(studentName);
        setStudentID(studentID);

        bookList = new ArrayList<Book>();
    }

    public void addBookList(String bookName, int bookID) {
        Book book = new Book(bookName, bookID);
        bookList.add(book);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void showStudentInfo() {
        System.out.print(getStudentName() + "학생이 읽은 책은: ");
        for(Book book : bookList) {
            System.out.print(book.getBookName()  + "(" + book.getBookID() + ") ");
        }
        System.out.println("입니다.");
    }
}
