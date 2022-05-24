package academic.model;

/**
 * @author Lile 
 */

public class Student {

    // class definition
    public String studentId;
    public String studentName;
    public String year;
    public String studyProgram;

    public Student(String studentId,
            String studentName,
            String year,
            String studyProgram) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.year = year;
        this.studyProgram = studyProgram;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return studentId + "|" + studentName + "|" + year + "|" + studyProgram;
    }
}