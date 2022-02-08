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

/*    @Test
    void testConstructor() {

        var student = new Student("Andrè", "Schreck", 35);
        System.out.println(student.toString());
        String actual = student.toString();
        assertEquals("Vorname: Andrè\nNachname: Schreck\nAlter: 35", actual);

    }

    @Test
    void testEquals() {

        var student = new Student("Andrè", "Schreck", 35);
        var student1 = new Student("Andrè", "Schreck", 35);
        boolean actual = student.equals(student1);
        assertTrue(actual);

    }*/

}