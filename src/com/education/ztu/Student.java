package com.education.ztu;

public class Student extends Person {
    private String university;
    private String speciality;
    private int course;
    private static int counter;

    {
        university = "Житомирська політехніка";
        speciality = "Інженерія програмного забезпечення";
        course = 1;
        counter++;
    }

    public Student() {
    }

    public Student(String university, int course, String speciality) {
        this.university = university;
        this.course = course;
        this.speciality = speciality;
    }

    public Student(String firstname, String lastname, int age, Gender gender, Location location,
                   String university, int course, String speciality) {
        super(firstname, lastname, age, gender, location);
        this.university = university;
        this.course = course;
        this.speciality = speciality;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static int showCounter() {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println("Студент");
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo() + ", університет: " + university
                + ", спеціальність: " + speciality + ", курс: " + course;
    }
}
