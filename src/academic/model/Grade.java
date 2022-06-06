package academic.model;

/**
 * @author Lile 
 * @author Daniel
 */

public class Grade {
    private String Grade;

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public static Float getFLoatGrade(String _grades) {
        Float floatGrade;
        if (_grades.equals("A")) {
            floatGrade = 4.00f;
        } else if (_grades.equals("AB")) {
            floatGrade = 3.50f;
        } else if (_grades.equals("B")) {
            floatGrade = 3.00f;
        } else if (_grades.equals("BC")) {
            floatGrade = 2.50f;
        } else if (_grades.equals("C")) {
            floatGrade = 2.00f;
        } else if (_grades.equals("D")) {
            floatGrade = 1.00f;
        } else {
            floatGrade = 0.00f;
        }
        return floatGrade;
    }
}
