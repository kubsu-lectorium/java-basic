package ru.lihogub;

public class Main {
    public static void main(String[] args) {
        // создали ссылку (в термина C++ - это на самом деле указатель)
        Cheburashka cheburashka;

        // создаем объект в куче и ссылку на него кладем в переменную cheburashka
        cheburashka = new Cheburashka("}{очу апельсинов!");

        /* вызываем метод */
        cheburashka.makeSound();
    }
}
