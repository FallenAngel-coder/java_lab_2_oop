package com.education.ztu;

public class Teacher extends Person {
    private String university;
    private String subject;
    private Car car;
    private static int counter;

    {
        university = "Житомирська політехніка";
        subject = "Java";
        car = new Car();
        counter++;
    }

    public Teacher() {
    }

    public Teacher(String university, String subject, Car car) {
        this.university = university;
        this.subject = subject;
        this.car = car;
    }

    public Teacher(String firstname, String lastname, int age, Gender gender, Location location,
                   String university, String subject, Car car) {
        super(firstname, lastname, age, gender, location);
        this.university = university;
        this.subject = subject;
        this.car = car;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public static int showCounter() {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println("Викладач");
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo() + ", університет: " + university
                + ", предмет: " + subject + ", автомобіль: " + car.getBrand();
    }
}
