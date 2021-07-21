package reference;

public class Subject {

    String subjectName;
    int score;
    int subjectID;

    public void setSubject(int subjectID, String subjectName, int score) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.score = score;
    }
}
