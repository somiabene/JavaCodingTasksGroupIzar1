package week8;

import java.util.Arrays;

public class ArrayNunique {
    public static int[] generateArrayWithSumZero(int N) {
        int[] arr = new int[N];
        int num = 1;

        for (int i = 0; i < N; i++) {
            arr[i] = num;
            num = -num;
            num += 2; // Increment by 2 to ensure uniqueness
        }

        return arr;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] result = generateArrayWithSumZero(N);
        System.out.println(Arrays.toString(result));
    }

}


/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
 */