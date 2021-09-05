package ru.lihogub;

public class Main {
    public static void main(String[] args) {

        Cheburashka cheburashka = new Cheburashka("Oranges!");
        Gena gena = new Gena("This is the way!");

        // each instance keeps different data
        cheburashka.makeSound();
        gena.makeSound();

        gena.playMelody();
    }
}
