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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }

}
