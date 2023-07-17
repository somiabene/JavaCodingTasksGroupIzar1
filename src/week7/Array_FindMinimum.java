package week7;

import java.util.Arrays;

public class Array_FindMinimum {

    public static void main(String[] args) {
        int[] arr = {12, -9, 0, 25};
        System.out.println("minNum(arr) = " + minNum(arr));

    }

    public static int minNum(int[] arr){
        int min = arr[0];
        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }


}


