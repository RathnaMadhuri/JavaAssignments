import model.Student;
import service.StudentGradeService;
import service.StudentService;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <Studemt> void main(String[] args) {


        //StudentService studentservice = new StudentService();
       //List<Student> students = new ArrayList<>();

       //studentservice.createStudent(2, "john", 11, students);
       //students.forEach(System.out::println);

       StudentGradeService storeGrades = new StudentGradeService();
        HashMap<String, Integer> student= new HashMap<>();
       storeGrades.storingStudentGrades("John",80,student);
        storeGrades.storingStudentGrades("martha",90,student);

        //for (String i : student.keySet()) {
        //    System.out.println("key: " + i + " value: " + student.get(i));
        //}

        for


        //System.out.println(student.get("John"));

    }
}