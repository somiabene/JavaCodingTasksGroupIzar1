package week7;

public class ArrayFindMin {

        public static int findMaximum(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Input array is null or empty.");
            }

            int max = arr[0]; // Initialize max to the first element of the array

            // Loop through the array to find the maximum element
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] numbers = { 10, 5, 20, 7, 15 };
            int maxNumber = findMaximum(numbers);
            System.out.println("The maximum number is: " + maxNumber);
        }
    }


/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array

 */