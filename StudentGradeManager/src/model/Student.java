package model;

import java.util.List;

public class Student {

    // Class attributes
    private Integer id;
    private String name;
    private List<Double> grades;

    // Contructors
    public Student() {}
    public Student(Integer id, String name, List<Double> grade) {
        this.id = id;
        this.name = name;
        this.grades = grade;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
