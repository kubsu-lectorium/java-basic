package ru.lihogub;

public class Cheburashka {
    String cheburashkaSound; // field

    /* constructor */
    Cheburashka(String sound) {
        cheburashkaSound = sound;
    }

    /* method №1 */
    void makeSound() {
        System.out.println("Cheburashka sound=" + cheburashkaSound);
    }

    /* method №2 */
    void takeOrange() {
        System.out.println("Take orange… Nyam-nyam");
    }
}