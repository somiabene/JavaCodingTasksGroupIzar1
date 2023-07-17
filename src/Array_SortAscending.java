import java.util.ArrayList;
import java.util.Arrays;

public class Array_SortAscending {
    public static void main(String[] args) {
        /*
        Question2: Array - Sort Ascending
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays
        class
        Ex: int[] arr = {10, 9, 8, 7};
        arr = Sort(arr); ==>{ 7, 8, 9, 10};

         */

        int[] arr={10, 9, 8, 7};
        System.out.println("sortAscending(arr) = " + Arrays.toString(sortAscending(arr)));
    }

        public static int[] sortAscending(int[] arr){

                ArrayList<Integer> list=new ArrayList<>();
                for(int each: arr)
                    list.add(each);

                for(int i=0; i < arr.length; i++) {
                    arr[i] = findMin(list);
                    list.remove(Integer.valueOf(arr[i]));
                }
                return arr;
            }
            public static int findMin(ArrayList<Integer> a) {
                int min =Integer.MAX_VALUE;
                for(int each: a)
                    min = Math.min(min, each);
                return min;
            }

        }


