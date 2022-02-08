package de.stedo;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {

    private Student[] allStudents;

    StudentDB(Student[] students) {

        this.allStudents = students;

    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allStudents=" + Arrays.toString(allStudents) +
                '}';
    }

    public Student randomStudent() {

        int arrLength = allStudents.length;
        double randomNumber = Math.random() * arrLength;

        return allStudents[(int) randomNumber];

    }

}
