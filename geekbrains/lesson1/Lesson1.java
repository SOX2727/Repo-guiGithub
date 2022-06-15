package ru.geekbrains.lesson1;
public class Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 3;
        int b = -5;
        int c = a + b;
        if (c >= 0)
            System.out.println("Сумма Положительная");
        if (c < 0)
            System.out.println("Сумма Отрицательная");
    }
    public static void printColor() {
        int value = 50;
        if (value <= 0)
            System.out.println("Красный");
        if (value > 0 & value <= 100)
            System.out.println("Желтый");
        if (value > 100)
            System.out.println("Зеленый");
    }
    public static void compareNumbers() {
        int a = 50;
        int b = 10;
        if (a >= b)
            System.out.println("a>=b");
        if (a < b)
            System.out.println("a<b");
    }
    }