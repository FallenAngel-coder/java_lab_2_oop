package com.education.ztu;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Додавання: " + Operation.addition(10, 5, 2));
        System.out.println("Віднімання: " + Operation.subtraction(10, 5, 2));
        System.out.println("Множення: " + Operation.multiplication(10, 5, 2));
        System.out.println("Ділення: " + Operation.division(15, 2, 2));
        System.out.println("Середнє арифметичне: " + Operation.average(2, 3, 5));
        System.out.println("Максимум: " + Operation.maximum(10, 5, 2));
        System.out.println("Мінімум: " + Operation.minimum(10, 5, 2));

        for (Location location : Location.values()) {
            System.out.println(location);
        }
    }
}
