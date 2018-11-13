package com.company.lab2.arrays;

import java.util.Arrays;

public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray;
        firstArray = new float[4]; // TODO init it's array by new with size 4.

        firstArray[0] = 6;
        firstArray[3] = 9;//  TODO insert some value to start of array and to end of array.

        int[] intArray = {7, 11, 5, 26, 3}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, 4); // TODO copy "intArray". Use copyOf...

        // 1.3)
        Arrays.sort(intArrayCopy);// TODO sort "intArrayCopy", use Arrays sort.

        // 1.4)
        System.out.println(Arrays.toString(intArrayCopy));// TODO print "intArrayCopy", use Arrays toString.

        // 1.5)
        if (Arrays.equals(intArray, intArrayCopy)) {
            System.out.println("Arrays equal");
        } else {
            System.out.println("Arrays not equal");
        }
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".


        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        int sum = 0;
        int oddsum = 0;
        int max = testArray[0];// Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }
        for (int i = 0; i < testArray.length; i++) {
            sum = sum + testArray[i];
            if (i % 2 != 0) {
                oddsum = oddsum + testArray[i];
            }
            if (testArray[i] > max) {
                max = testArray[i];
            }

        }
        System.out.println("Sum total is  " + sum + "  Sum odd is  " + oddsum + "  Max is  " + max);

        // 2.1)
        // TODO calc sum of all array elements and print result.

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.

        // 2.3)
        // TODO find max value in array.


        // PART 3

        //3.1
        int twoDimArray[][] = new int[5][5];
        int twoSum = 0;
        for (int e = 0; e < 5; e++) {
            for (int f = 0; f < 5; f++) {
                twoDimArray[e][f] = e * f;
                twoSum = twoSum + twoDimArray[e][f];// TODO create two-dimensional array with size [3][4]
            }
        }
        System.out.println("two dimension array elements sum is " + twoSum);

        //3.2
        // TODO fill array with any numbers in cycles.

        //3.3
        // TODO calc sum of all array elements and print result.


        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        long max2 = 0;
        long  min2 = 999999;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i > 2) {
                    if (i < 6) {
                        if (j%3 == 0) {
                            if (matrix[i][j] < min2) {
                                min2 = matrix[i][j];

                            }
                            if (matrix[i][j] > max2) {
                                max2 = matrix[i][j];
                            }
                        }
                    }
                }
            }

        }
        System.out.println(max2 +min2);
    }
}
