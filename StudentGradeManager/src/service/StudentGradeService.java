package service;

import model.Student;

import java.util.HashMap;
import java.util.List;

public class StudentGradeService {

    public  void storingStudentGrades(String name, int grade,HashMap<String, Integer> grades){

        grades.put(name,Integer.valueOf(grade));
    }

    //public float calculateAverage(float[] grades){
       //float sum = 0;
       //float average =0;
        //for(float i = 0; i < grades.size(); i++);
        //sum +=  grades[i];
        //average = sum/grades.size();

   // }
}
