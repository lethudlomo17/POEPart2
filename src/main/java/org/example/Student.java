package org.example;

public class Student {


    public  String id;
    public  String name;

    public  int age;
    public  String email;

    public  String course;


    public Student(String name, String id,int age,String email, String course) {
        this.name = name;
        this.id = id;
        this.age=age;
        this.email=email;
        this.course=course;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }

}
