package com.education.ztu;

public abstract class Person implements Human {
    private String firstname;
    private String lastname;
    private String fullname;
    private int age;
    private Gender gender;
    private Location location;

    {
        firstname = "Ім'я";
        lastname = "Прізвище";
        fullname = firstname + " " + lastname;
        age = 18;
        gender = Gender.MALE;
        location = Location.ZHYTOMYR;
    }

    public Person() {
    }

    public Person(String firstname, String lastname, int age, Gender gender, Location location) {
        this.firstname = firstname;
        this.lastname = lastname;
        fullname = firstname + " " + lastname;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        fullname = firstname + " " + lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        fullname = firstname + " " + lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void sayFullName() {
        System.out.println(fullname);
    }

    @Override
    public void sayAge() {
        System.out.println(age);
    }

    @Override
    public void sayLocation() {
        System.out.println(location);
    }

    @Override
    public void sayGender() {
        System.out.println(gender);
    }

    public abstract void getOccupation();

    public String getFullInfo() {
        return fullname + ", вік: " + age + ", стать: " + gender + ", місто: " + location;
    }
}
