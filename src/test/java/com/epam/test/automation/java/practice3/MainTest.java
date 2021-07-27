package com.epam.test.automation.java.practice3;

import org.testng.*;
import org.testng.annotations.Test;

public class MainTest {
    private int input[];
    private int result[];

    @Test
    public void testTask1() {
        int input[] = {10, 5, 3, 4};
        int result[] = {4, 5, 3, 10};
        Assert.assertEquals(result, Main.task1(input));
    }

    @Test
    public void testTask2() {
        int input[] = {5, 350, 350, 4, 350};
        int result = 3;
        Assert.assertEquals(result, Main.task2(input));
    }

    @Test
    public void testTask3() {
        int input[][] = {{2, 4, 3, 3},  {5, 7, 8, 5},  {2, 4, 3, 3},  {5, 7, 8, 5}};
        int result[][] = {{2, 1, 1, 1},  {0, 7, 1, 1},  {0, 0, 3, 1},  {0, 0, 0, 5}};
        Assert.assertEquals(result, Main.task3(input));
    }
}