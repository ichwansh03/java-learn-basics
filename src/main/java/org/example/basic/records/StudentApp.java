package org.example.basic.records;

public class StudentApp {

    public static void main(String[] args) {

        StudentRecords student = new StudentRecords("Ichwan","19312131");

        System.out.println(student.name());
        System.out.println(student.npm());
        student.sayStudent();

        System.out.println(new StudentRecords("Ahmad"));
    }
}
