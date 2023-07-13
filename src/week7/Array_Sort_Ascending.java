package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array_Sort_Ascending {
    /*
       Question2: Array - Sort Ascending
       Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays
       class
       Ex: int[] arr = {10, 9, 8, 7};
       arr = Sort(arr); ==>{ 7, 8, 9, 10};

        */
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, -7, 0};

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, -7, 0));
        Collections.sort(list);
        //System.out.println(list);
        System.out.println("sortAscending(arr) = " + Arrays.toString(sortAscending(arr)));
    }

    public static int[] sortAscending(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++ ){//10, 9, 8, -7, 0
                int temp=arr[j];
                if (arr[j]>arr[j+1]){
                  arr[j] = arr[j + 1];
                  arr[j+1]=temp;
              }
            }

        }
        return arr;
    }


}
