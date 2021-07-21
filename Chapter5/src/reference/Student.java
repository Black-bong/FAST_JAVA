package reference;

public class Student {

    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void showStudentScore() {
        int total = korea.score + math.score;
        System.out.println(studentName + "의 총점은 : " + total + "점 입니다.");
    }

}
