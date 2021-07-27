package com.epam.test.automation.java.practice3;

public class Main {
    private Main() {
    }

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) throw new IllegalArgumentException();
        }
        int i = array.length - 1;
        int j = 0;
        int temp = 0;
        while (i > j) {
            if (array[i] % 2 == 0 && array[j] % 2 == 0) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i--;
                j++;
            } else {
                i--;
                j++;
            }
        }
        return array;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) throw new IllegalArgumentException();
        }
        int max1 = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > array[max1]) {
                max1 = i;
            }
        }
        int max2 = 0;
        for (int i = max1+1; i < array.length; ++i) {
            if (array[i] == array[max1]) {
                max2 = i;
            }
        }
        return Math.abs(max2-max1);
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int[][] task3(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] <= 0) throw new IllegalArgumentException();
            }
        }
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 1 + i; j < matrix.length; j++) {
                matrix[i][j] = 1;
            }
        }
        for (int j = 0; j < matrix.length - 1; j++) {
            for (int i = 1 + j; i < matrix.length; i++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }
}