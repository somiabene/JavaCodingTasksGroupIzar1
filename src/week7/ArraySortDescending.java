package week7;

public class ArraySortDescending {
        public static int[] sortDescending(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
            return arr;
        }


        public static void main(String[] args) {
            int[] arr = {10, 20, 7, 8, 90};
            arr = sortDescending(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

    }


/*Question3: Array - Sort Descending
        Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
        arr = Sort(arr); ==> {90, 20, 10, 8, 7};

 */