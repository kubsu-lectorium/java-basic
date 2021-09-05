package ru.lihogub;

public class Main {
    public static void main(String[] args) {
        // multiple Cheburashka instances
        Cheburashka leftCheburashka = new Cheburashka("Left twix bar");
        Cheburashka rightCheburashka = new Cheburashka("Right twix bar");

        // each instance keeps different data
        leftCheburashka.makeSound();
        rightCheburashka.makeSound();
    }
}
