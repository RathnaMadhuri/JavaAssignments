package service;

import model.Student;

import java.util.List;

public class StudentService {

    public void createStudent(int id, String name, int grade, List<Student> student){

        Student newStudent = new Student(id, name, grade);
        student.add(newStudent);

    }


}
