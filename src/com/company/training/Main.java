package com.company.training;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher scarlett = new Teacher(3,"Scarlett",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(scarlett);

        Teacher megan = new Teacher(4,"Megan",200);



        Student john = new Student(1,"John",4);
        Student angela = new Student(1,"Angela",7);
        Student smith = new Student(1,"Smith",6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(john);
        studentList.add(angela);
        studentList.add(smith);

        School schoolNumber1 = new School(teacherList,studentList);

        schoolNumber1.addTeachers(megan);

        angela.payFeesPaid(5000);
        smith.payFeesPaid(6000);
        System.out.println("School № 1 earned money = $" + schoolNumber1.getTotalMoneyEarned());

        System.out.println("/////////////////////////////////////////");

        lizzy.receiveSalary(lizzy.getSalary());
        scarlett.receiveSalary(scarlett.getSalary());
        System.out.println("School № 1 has spent for salary to " + scarlett.getName()
        + " and now has $" + schoolNumber1.getTotalMoneyEarned());

        System.out.println(scarlett);
        System.out.println(smith);
        System.out.println(angela);
        System.out.println(john);
    }
}
