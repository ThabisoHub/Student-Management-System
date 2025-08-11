
import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private int age;
    private ArrayList<Double> grades;

    //Constructor
    public Student (String name, String studentId, int age, ArrayList<Double> grades) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.grades = grades;
    }

    //Getters and setters
    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //studentId
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    //age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //grades
    public ArrayList<Double> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    //Calculate average grade
    public double calculateAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    //Display student details
    @Override
    public String toString() {
        return "ID: " + studentId + ", \nName: " + name +
               ", \nAge: " + age + ", \nGrades: " + grades +
               ", \nAverage: " + String.format("%.2f", calculateAverageGrade());
    }
}