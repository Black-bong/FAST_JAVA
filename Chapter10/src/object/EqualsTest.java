package object;

class Student{
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student)obj;
            return (this.studentNum == std.studentNum);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("==============");

        Student studentLee = new Student(100, "Lee");
        Student studentLee2 = studentLee;
        Student studentSin = new Student(100, "Lee");

        System.out.println(studentLee == studentLee2);
        System.out.println(studentLee == studentSin);
        System.out.println(studentLee.equals(studentSin));

        System.out.println(studentLee.hashCode());
        System.out.println(studentSin.hashCode());
    }
}
