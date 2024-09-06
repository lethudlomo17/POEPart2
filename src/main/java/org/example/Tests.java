package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {

    private StudentManagementApp app;
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("1\nLethu\n20\nLethu@gmail\nCS\n".getBytes());

    @BeforeEach
    public void setUp() {
        app = new StudentManagementApp();
        System.setIn(inputStream);
    }

    @Test
    public void testCaptureNewStudent() {
        app.captureNewStudent();

        assertTrue(app.students.size() > 0);
        Student student = app.students.get(0);
        assertEquals("1", student.getId());
        assertEquals("Lethu", student.getName());
        assertEquals(20, student.getAge());
        assertEquals("Lethu@gmail", student.getEmail());
        assertEquals("CS", student.getCourse());
    }

    @Test
    public void testSearchForStudent() {
        app.captureNewStudent();
        InputStream in = new ByteArrayInputStream("123\n".getBytes());
        System.setIn(in);

        app.searchForStudent();


    }

    @Test
    public void testDeleteStudent() {
        app.captureNewStudent();
        InputStream in = new ByteArrayInputStream("123\n".getBytes());
        System.setIn(in);

        app.deleteStudent();

        assertTrue(app.students.isEmpty());
    }

    @Test
    public void testPrintStudentReport() {
        app.captureNewStudent();

    }
}
