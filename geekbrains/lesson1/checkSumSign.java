package ru.geekbrains.lesson1;

public class checkSumSign {
    public static void checkSumSign(String[] args) {
        checkSumSign();
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
}
