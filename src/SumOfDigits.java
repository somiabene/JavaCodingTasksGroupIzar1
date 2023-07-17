public class SumOfDigits {
    public static void main(String[] args) {
        /*
        Write a method that can return the sum of the digits in a String
            Ex:  "12 java 5 apple 3"  ==>  20
         */

        String str = "12 java 5 apple 3";

        System.out.println("sumOfDigits(str) = " + sumOfDigits(str));

        System.out.println("sumOfDigits2(\"12 java 5 apple 3\") = " + sumOfDigits2("12 java 5 apple 3"));

        System.out.println("calculateDigitSum(\"12 java 5 apple 3\") = " + calculateDigitSum("12 java 5 apple 3"));

    }

    public static int sumOfDigits(String str) {

        int sum = 0;




        //12 java  5 apple 3

        for (int i =0; i<str.length(); i++){
            str.charAt(i);
        }

        char[] ch = str.toCharArray();
        for (char each : ch)
            if (Character.isDigit(each)) {

                sum += Integer.valueOf("" + each);
            }

        return sum;



    }

    public static int sumOfDigits2(String a){
        int total=0;
        String digits="";

        for(int i=0; i<a.length(); i++){
            char ch=a.charAt(i);
            if(ch>='0' && ch <='9'){
              total +=ch-48;// This line adds the numeric value of the digit to the total variable. Since the ASCII value of '0' is 48, subtracting 48 from the character ch converts it to its corresponding numeric value. The result is then added to the total.
            }
        }
        return total;
    }
    public static int calculateDigitSum(String input) {
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                total += digit;
            }
        }

        return total;
    }

}

