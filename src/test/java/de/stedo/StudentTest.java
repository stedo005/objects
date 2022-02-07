package de.stedo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {




    @Test
    void getFirstname() {

        Student student1 = new Student();
        student1.setFirstname("Steve");
        String actual = student1.getFirstname();
        assertEquals("Steve", actual);

    }

    @Test
    void getLastname() {

        Student student1 = new Student();
        student1.setLastname("Dölgner");
        String actual = student1.getLastname();
        assertEquals("Dölgner", actual);

    }

    @Test
    void getAge() {

        Student student1 = new Student();
        student1.setAge(43);
        int actual = student1.getAge();
        assertEquals(43, actual);

    }

}