package org.example.basic.records;

public class StudentApp {

    public static void main(String[] args) {

        StudentRecords student = new StudentRecords("Ichwan","19312131");

        System.out.println(student.name());
        System.out.println(student.npm());
        student.sayStudent();

        System.out.println(new StudentRecords("Ahmad"));

        validate("Named","19312131");
    }

    @ValidateStudents(major = "Informatics")
    static void validate(String name, String npm) {

        if (name.matches(ValidateStudents.name) && npm.matches(ValidateStudents.npm)){
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
