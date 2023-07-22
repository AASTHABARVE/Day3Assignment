package com.bridgelabs.day3;

public class DuplicateElements {
    public static void main(String args[])
    {
        int[] arr = {4, 2, 3, 5, 2, 6, 3, 7, 8, 5, 9};

        System.out.println("Duplicate elements in array: ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.print(arr[j] + " ");

                }
            }
        }
    }
}
