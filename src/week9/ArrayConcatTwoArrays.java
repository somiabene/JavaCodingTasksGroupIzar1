package week9;

import java.util.Arrays;

public class ArrayConcatTwoArrays {
        public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

            int[] result = new int[arr1.length + arr2.length];

            // Copy elements of the first array into the result array
            System.arraycopy(arr1, 0, result,0, arr1.length);

            // Copy elements of the second array into the result array
            System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

            return result;

        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};

            int[] concatenatedArray =concatTwoArrays(arr1, arr2);
            System.out.println(Arrays.toString(concatenatedArray)); // Output: [1, 2, 3, 4, 5, 6]
        }
    }



/*
1) Array - Concat two arrays
Write a return method that can concate two arrays
 */