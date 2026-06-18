import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Create my local storage
        Map<Integer, Student> studentsDB = new HashMap<>();

        // Call my class responsible for the business logic
        StudentService studentservice = new StudentService();

        // Create my students data
        Student student1 = new Student(1, "John", List.of(10.0, 9.5, 8.0));
        Student student2 = new Student(2, "Mary", List.of(10.0, 9.5, 8.0));

        // Add student to my DB
        studentservice.createStudent(student1, studentsDB);
        studentservice.createStudent(student2, studentsDB);
        studentservice.createStudent(student1, studentsDB); // try to add duplicate

        // Show my students from my storage
        studentsDB.forEach((key, value) -> {
            System.out.println("Student ID: " + key + " [" + value.getName() + "]");
            System.out.println("Grades: " + value.getGrades());
            System.out.println("AVG: " + studentservice.calculateAverage(value.getGrades()));
            System.out.println("Highest: " + studentservice.getHighestGrade(value.getGrades()));
            System.out.println("Lowest: " + studentservice.getLowestGrade(value.getGrades()));
            System.out.println("");
        });
    }

}