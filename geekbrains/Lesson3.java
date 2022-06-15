package ru.geekbrains;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int array[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(chenging01(array)));
        System.out.println("Task 2");
        fillArray();
        System.out.println("Task 3");
        int array1[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArrayes(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("Task 4");
        createSquareArray(10);
        System.out.println("Task 5");
        int array2[] = retLenArr(10, 5);
        System.out.println(Arrays.toString(array2));
    }

    public static int[] chenging01(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }

    public static void modifierForArrayes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void createSquareArray(int size) {
        int[][] sqrArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] retLenArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}