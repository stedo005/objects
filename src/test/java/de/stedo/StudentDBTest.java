package de.stedo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testArray() {

        Student student1 = new Student(1, "Steve", "Dölgner");
        Student student2 = new Student(2, "André", "Schreck");
        Student student3 = new Student(3, "Thomas", "Kittlaus");

        Student[] arrStudents = new Student[3];
        arrStudents[0] = student1;
        arrStudents[1] = student2;
        arrStudents[2] = student3;

        StudentDB allStudent = new StudentDB(arrStudents);

        System.out.println(allStudent.randomStudent());
        System.out.println(allStudent);

    }

}