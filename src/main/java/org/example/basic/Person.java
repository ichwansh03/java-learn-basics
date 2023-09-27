package org.example.basic;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Hello "+name+" my name is "+this.name);
    }

    void sayClass(Person person){
        System.out.println("Hello "+person.name+" my name is "+this.name);
    }
}

class Student extends Person {

    Student(String name) {
        super(name);
    }

    void hello(){
        sayHello("Ujang");
    }
}

class Main{
    public static void main(String[] args) {
        var person = new Person("Person");
        person.sayHello("Ujang");

        var student = new Student("Mahfud");
        student.hello();
        student.sayHello("Mega");
        //polymorphism: merubah bentuk class dari objek aslinya
        student.sayClass(new Person("Abdul"));
    }
}
