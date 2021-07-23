package arraylisttest;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student("kim", 1001);
        studentKim.addBookList("태백산맥1", 101);
        studentKim.addBookList("태백산맥2", 102);

        Student studentLee = new Student("Lee", 1002);
        studentLee.addBookList("해리포터1", 201);
        studentLee.addBookList("해리포터2", 202);
        studentLee.addBookList("해리포터3", 203);
        studentLee.addBookList("해리포터4", 204);
        studentLee.addBookList("해리포터5", 205);
        studentLee.addBookList("해리포터6", 206);

        Student studentSin = new Student("Sin", 1003);
        studentSin.addBookList("토지1", 301);
        studentSin.addBookList("토지2", 302);
        studentSin.addBookList("토지3", 303);

        studentKim.showStudentInfo();
        studentLee.showStudentInfo();
        studentSin.showStudentInfo();

    }
}
