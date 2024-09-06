package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManagementApp {

    private static final Scanner scanner = new Scanner(System.in);
    public ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        StudentManagementApp studentManagementApp= new StudentManagementApp();

                studentManagementApp.display();

    }
    public void display(){
        while (true) {
            displayMenu();
            String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        captureNewStudent();
                        break;
                    case "2":
                        searchForStudent();
                        break;
                    case "3":
                        deleteStudent();
                        break;
                    case "4":
                        printStudentReport();
                        break;
                    case "5":
                        System.out.println("Exiting Application.");
                        return;
                    default:
                        System.out.println("Exiting Application.");

            }
        }
    }

    public void displayMenu() {
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*******************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");




            System.out.print("Please select one of the following menu items:\n" +
                    "(1) Capture a new student.\n" +
                    "(2) Search for a student.\n" +
                    "(3) Delete a student.\n" +
                    "(4) Print student report.\n" +
                    "(5) Exit Application.\n" +
                    "Choice: ");

    }


    public void captureNewStudent() {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*******************************");
        System.out.println("Enter the student id: ");
        String id = scanner.nextLine();
        System.out.println("Enter the student name: ");
        String name = scanner.nextLine();
        int age= 0;
        Boolean isValid=false;
        while (!isValid) {
            System.out.println("Enter the student age: ");
            String studentAge = scanner.nextLine();

            if(isInteger(studentAge)) {
                age = Integer.parseInt(studentAge);
                if (age >= 16) {
                    isValid = true;
                } else {
                    System.out.println("You have entered the incorrect student age!!!");
                }
            }
            else {
                System.out.println("You have entered the incorrect student age!!!");
            }
        }
        System.out.println("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.println("Enter the student course: ");
        String course = scanner.nextLine();
        students.add(new Student(id,name,age,email,course));
        System.out.println("Student added successfully.");
    }
    public  void searchForStudent() {
        System.out.println("Enter student ID to search: ");



        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("-------------------------------");
                System.out.println("Student ID: " + student.id);
                System.out.println("Student NAME: " + student.name);
                System.out.println("Student AGE: " + student.age);
                System.out.println("Student EMAIL: " + student.email);
                System.out.println("Student COURSE: " + student.course);
                System.out.println("-------------------------------");
                return;
            }
        }
        System.out.println("Student with student Id: "+ id +" was not found!");
    }

    public boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public void deleteStudent() {
        System.out.println("Enter student ID to delete: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public  void printStudentReport() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        int counter=0;
        for (Student student : students) {
            counter++;
            System.out.println("STUDENT "+ counter);
            System.out.println("-------------------------------");
            System.out.println("Student ID: " + student.id);
            System.out.println("Student NAME: " + student.name);
            System.out.println("Student AGE: " + student.age);
            System.out.println("Student EMAIL: " + student.email);
            System.out.println("Student COURSE: " + student.course);
            System.out.println("-------------------------------");
        }
    }

}