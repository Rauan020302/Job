package com.company.training;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static Integer totalMoneyEarned;
    private static Integer totalMoneySpent;

    public School(){}

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public Integer getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(Integer MoneyEarned) {
        totalMoneyEarned+=MoneyEarned;
    }

    public Integer getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(Integer MoneySpent) {
        totalMoneyEarned-=MoneySpent;
    }
}
