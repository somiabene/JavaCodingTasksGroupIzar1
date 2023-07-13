package week8;

import java.util.Arrays;

public class ArrayNInteger {
    public static void main(String[] args) {
        //Array - N unique integers that sum up to 0
        //Write a function that given an integer N (1 < N < 100), returns an array
        //containing N unique integers that sum up to 0. The function can return any
        //such array.
        //For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        //The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
        //For N = 3 one of the possible answers is [-1,0,1] (but there are many more
        //correct answers).

        int N = 3;
        int[] result = generateArray(N);

        System.out.println(Arrays.toString(result));
        // Print the generated array
    }

    public static int[] generateArray(int N) {
        int[] arr = new int[N];

        // Handle edge case where N is odd
        if (N % 2 != 0) {
            arr[0] = 0;
        }

        // Fill the array with unique integers
        for (int i = 0; i < N / 2; i++) {
            arr[i] = i + 1;
            arr[N - i - 1] = -(i + 1);
        }

        return arr;
    }

}
