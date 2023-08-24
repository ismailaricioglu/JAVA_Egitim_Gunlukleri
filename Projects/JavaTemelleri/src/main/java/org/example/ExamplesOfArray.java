package org.example;

public class ExamplesOfArray {
    // one-dimensional arrays and usage patterns
    public void ArrayAndUsagePatterns() {

        // Type 1: example for type of define
        int[] numbers1 = new int[4];
        numbers1[0] = 0;
        numbers1[1] = 1;
        numbers1[2] = 2;
        numbers1[3] = 3;
        for (int number : numbers1)
            System.out.println("Number is " + number);

        // Type 2: example for type of define
        int[] numbers2 = new int[]{4, 5, 6, 7};
        for (int number : numbers2)
            System.out.println("Number is " + number);

        // Type 3: example for type of define
        int[] numbers3 = {8, 9, 10, 11};
        for (int number : numbers3)
            System.out.println("Number is " + number);
    }

    // multidimensional arrays and usage patterns
    public void MultiArraysAndUsagePatterns() {

        // Type 1: example for type of define
        int[][] numbers1 = new int[2][3];
        numbers1[0][0] = 0;
        numbers1[0][1] = 1;
        numbers1[0][2] = 2;
        numbers1[1][0] = 3;
        numbers1[1][1] = 4;
        numbers1[1][2] = 5;
        for (int[] numbers : numbers1)
            for (int number : numbers)
                System.out.println("Number is " + number);

        // Type 2: example for type of define
        int[][] numbers2 = new int[][]{{6, 7}, {8, 9}};
        for (int[] numbers : numbers2)
            for (int number : numbers)
                System.out.println("Number is " + number);

        // Type 3: example for type of define
        int[][] numbers3 = {{10, 11}, {12, 13}};
        for (int[] numbers : numbers3)
            for (int number : numbers)
                System.out.println("Number is " + number);
    }
}
