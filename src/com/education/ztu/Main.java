package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new Car();
        Car car = new Car("Toyota");
        System.out.println(defaultCar.getBrand());
        System.out.println(car.getBrand());

        Student defaultStudent = new Student();
        Student shortStudent = new Student("Житомирська політехніка", 2, "Комп'ютерні науки");
        Student student = new Student("Дмитро", "Коваль", 19, Gender.MALE, Location.ZHYTOMYR,
                "Житомирська політехніка", 2, "Інженерія програмного забезпечення");
        System.out.println(defaultStudent.getFullInfo());
        System.out.println(shortStudent.getFullInfo());
        student.setCourse(3);
        System.out.println(student.getFullInfo());
        student.sayFullName();
        student.sayAge();
        student.sayLocation();
        student.sayGender();
        student.whoIAm();
        student.getOccupation();

        Teacher defaultTeacher = new Teacher();
        Teacher shortTeacher = new Teacher("Київський політехнічний інститут", "Математика", car);
        Teacher teacher = new Teacher("Олена", "Мельник", 35, Gender.FEMALE, Location.KIYV,
                "Київський політехнічний інститут", "Java", car);
        System.out.println(defaultTeacher.getFullInfo());
        System.out.println(shortTeacher.getFullInfo());
        teacher.setSubject("Об'єктно-орієнтоване програмування");
        System.out.println(teacher.getFullInfo());
        teacher.getOccupation();

        Employee defaultEmployee = new Employee();
        Employee shortEmployee = new Employee("SoftServe", "Розробник", defaultCar);
        Employee employee = new Employee("Андрій", "Бондар", 28, Gender.MALE, Location.VINNYTSYA,
                "SoftServe", "Розробник", defaultCar);
        System.out.println(defaultEmployee.getFullInfo());
        System.out.println(shortEmployee.getFullInfo());
        employee.setPosition("Java-розробник");
        System.out.println(employee.getFullInfo());
        employee.getOccupation();

        System.out.println("Двигун працює: " + car.engineIsRunning());
        car.getEngine().startEngine();
        System.out.println("Двигун працює: " + car.engineIsRunning());
        car.drive(25);
        System.out.println("Пробіг: " + car.getMileage());
        car.getEngine().stopEngine();
        System.out.println("Двигун працює: " + car.engineIsRunning());
        defaultCar.setEngine(defaultCar.new Engine(true));
        System.out.println("Двигун іншого автомобіля працює: " + defaultCar.engineIsRunning());
        defaultCar.getEngine().stopEngine();

        System.out.println("Кількість студентів: " + Student.showCounter());
        System.out.println("Кількість викладачів: " + Teacher.showCounter());
        System.out.println("Кількість працівників: " + Employee.showCounter());

        Person person = student;
        System.out.println("person instanceof Student: " + (person instanceof Student));
        System.out.println("person instanceof Teacher: " + (person instanceof Teacher));
        System.out.println("person instanceof Human: " + (person instanceof Human));
    }
}
