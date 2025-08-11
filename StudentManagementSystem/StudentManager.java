
import java.util.ArrayList;

public class StudentManager {
    final ArrayList<Student> students = new ArrayList<>();
    
    //Add a student
    public void addStudent (Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    //find student by ID
    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                return student;
            
            }
        }
        return null;
    }

    //edit student details
    public void editStudent(String studentId, String newName, int newAge, ArrayList<Double> newGrades) {
        Student student = (Student) findStudentById(studentId);
        if (student != null) {
            student.setName(newName);
            student.setAge(newAge);
            student.setGrades(newGrades);
            System.out.println("Student details updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    //Display all Students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("=================List of Students========================");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    //display averages
    public void calculateAndDisplayAllAverages() {
        if (students.isEmpty()) {
            System.out.println("No students to calculate averages.");
        }
        
        System.out.println("===============Student Averages=====================");
        for (Student student : students) {
            String average = student.getName() + " Average grade: " +
            String.format("%.2f", student.calculateAverageGrade());
           System.out.println(average);
        }
    }

    public void removeStudent(String studentId) {
       Student student = findStudentById(studentId);
       if (student != null) {
        students.remove(student);
        System.out.println("Student removed successfully.");
       } else {
        System.out.println("Student not Found!");
       }
    }
}
