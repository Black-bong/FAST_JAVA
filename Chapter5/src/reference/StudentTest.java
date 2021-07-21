package reference;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(100, "이순신");
        Student studentKim = new Student(101, "김유신");

        studentKim.korea.setSubject(1, "국어", 100);
        studentLee.korea.setSubject(1, "국어", 90);
        studentKim.math.setSubject(2, "수학", 92);
        studentLee.math.setSubject(2, "수학", 82);

        studentLee.showStudentScore();
        studentKim.showStudentScore();
    }
}
