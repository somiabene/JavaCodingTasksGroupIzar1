package week8;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
     //Array - Move Zeros to the End
        //Write a method that can move all the zeros to last indexes of the array (Do
        //Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
        //0]
        int[] arr={1,0,2,0,3,0,4,0};

        System.out.println("moveZerosToTheEnd(arr) = " + Arrays.toString(moveZerosToTheEnd(arr)));

    }
    public static int[] moveZerosToTheEnd(int[] array){
        int[] result = new int[array.length];

        int j=0;

        for(int i=0; i< array.length; i++){
            if(array[i] !=0){
                result[j++] =array[i];
            }
        }
       return result;
    }

}
