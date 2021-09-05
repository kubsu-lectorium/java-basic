package ru.lihogub;

public class Gena {
    String cheburashkaSound; // field

    /* constructor */
    Gena(String sound) {
        cheburashkaSound = sound;
    }

    /* method №1 */
    void makeSound() {
        System.out.println("Gena sound=" + cheburashkaSound);
    }

    /* method №2 */
    void playMelody() {
        System.out.println("*Melody plays*");
    }
}