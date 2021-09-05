package ru.lihogub;

public class Cheburashka {
    String cheburashkaSound; // это поле

    /* это конструктор */
    Cheburashka(String sound) {
        cheburashkaSound = sound;
    }

    /* метод №1 */
    void makeSound() {
        System.out.println("Cheburashka sound=" + cheburashkaSound);
    }

    /* метод №2 */
    void takeOrange() {
        System.out.println("Take orange… Nyam-nyam");
    }
}