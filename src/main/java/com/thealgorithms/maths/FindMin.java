package com.thealgorithms.maths;

import java.util.Arrays;
import java.util.Random;

public class FindMin {

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        Random random = new Random();

        /* random size */
        int size = random.nextInt(100) + 1;
        int[] array = new int[size];

        /* init array with random numbers */
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt() % 100;
        }

        assert Arrays.stream(array).min().getAsInt() == findMin(array);
    }

    /**
     * Find the minimum number of an array of numbers.
     *
     * @param array the array contains element
     * @return min value
     */
    public static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("array must be non-empty.");
        }
        int min = Integer.MAX_VALUE;
        for (final var value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
