package service;

import model.Student;

import java.util.List;
import java.util.Map;

public class StudentService {

    public void createStudent(Student student, Map<Integer, Student> studentsDB) {
        // I could do some validations like: ID not null, Name is not empty, Grade >= 0
        /*
        * MAP Key: Integer - Student.ID
        * MAP Value: Student*
        * */
        studentsDB.put(student.getId(), student);
    }

    public Double calculateAverage(List<Double> grades) {
        double sum = 0.0;

        // Simple way: forEach
        for (Double grade : grades) {
            sum += grade;
        }

        // When you need to use the counter in your logic
//        for (int count = 0; count < grades.size(); count++) {
//            sum -= grades.get(count);
//        }

        return sum / grades.size();
    }

    public Double getHighestGrade(List<Double> grades) {
        // TO-DO
        return 0d;
    }

    public Double getLowestGrade(List<Double> grades) {
        //TO-DO
        return 0d;
    }

}
