package edu.handong.csee.java.university;

import edu.handong.csee.java.university.lecture.classroom;
import edu.handong.csee.java.university.lecture.student;

public class runner {

    public static void main(String[] args) {

        runner runner = new runner();
        runner.run(args);

    }

    public void run(String[] args) {

        student student1 = new student();
        student1.setName("JC");

        student student2 = new student();
        student2.setName("JH");

        student student3 = new student();
        student3.setName("HGU");


        System.out.println(student1.callName());
        System.out.println(student2.callName());
        System.out.println(student3.callName());

        classroom NTH412 = new classroom();

        NTH412.setClassroomNumber("NTH412");
        NTH412.addStudent(student1);
        NTH412.addStudent(student2);
        NTH412.addStudent(student3);

        System.out.println("In " + NTH412.getClassroomNumber() + ", we have " + NTH412.getNumOfStudents());

    }

}
