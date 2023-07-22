package com.bridgelabs.day3;

public class LargestElement {
    public static void main(String args[]) {
        int[] arr = new int[] {1, 2, 18, 4, 5, 6, 17, 8, 9, 10, 14};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);

    }
}
