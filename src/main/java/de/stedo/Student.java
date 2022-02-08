package de.stedo;

import java.util.Objects;

public class Student {

    private int id;
    private String firstname;
    private String lastname;
    private int age;

// Konstruktor

/*    Student(String firstname, String lastname, int age) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }*/

    Student(int id, String firstname, String lastname) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    /*   public String toString() {

        return "Vorname: " + firstname + "\n" + "Nachname: " + lastname + "\n" + "Alter: " + age;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age);
    }

    // Setter

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

// Getter

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

}