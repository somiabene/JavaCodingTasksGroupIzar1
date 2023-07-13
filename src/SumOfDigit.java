import java.util.ArrayList;

public class SumOfDigit {

    //    Write a method that can return the sum of the digits in a String
//Ex:  "12 java 5 apple 3"  ==>  20
    public static void main(String[] args) {
        String str = "12 java 5 apple 3";

        sumOfAllDigits(str);
    }
    public static void sumOfAllDigits(String str){

        int sumOfAll = 0;
        ArrayList<Integer> list = new ArrayList();



        String[] arr = str.split(" ");


        for (String eachElement : arr) {

            String sumOfEachNumber = "";
            for (int i = 0; i < eachElement.length(); i++) {//12--1 and 2; java-->j-a -v -a
                if (Character.isDigit(eachElement.charAt(i))) {
                    sumOfEachNumber += eachElement.charAt(i);
                }
            }
            if (!(sumOfEachNumber.isEmpty())) {
                list.add(Integer.valueOf(sumOfEachNumber));
            }
        }

        for (Integer each : list) {
            sumOfAll += each;

        }
        System.out.println(sumOfAll);

        System.out.println("---------------------");

        String input = "12 java 5 apple 3";
        int sum = sumOfDigits(input);
        System.out.println("Sum of digits: " + sum);


    }
    public static int sumOfDigits(String input) {
    int sum = 0;
    int currentNumber = 0;

        for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);

        if (Character.isDigit(c)) {
            // Multiply the current number by 10 and add the new digit
            currentNumber = currentNumber * 10 + (c - '0');
        } else {
            // If currentNumber is not zero, add it to the sum and reset currentNumber
            if (currentNumber != 0) {
                sum += currentNumber;
                currentNumber = 0;
            }
        }
    }

    // Handle the case when the last character(s) in the input string is a digit
        if (currentNumber != 0) {
        sum += currentNumber;
    }

        return sum;
}

}
