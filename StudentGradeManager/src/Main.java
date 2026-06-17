import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        StudentService studentservice = new StudentService();
       List<Student> students = new ArrayList<>();

       studentservice.createStudent(2, "john", 11, students);


        students.forEach(System.out::println);
    }
}