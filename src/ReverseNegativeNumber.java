public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int a = -100;
        System.out.println(reverseNegativeNumber(a));

        int b = -100;
        System.out.println(reverseNegativeNumber2(b));
    }

    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            return number;
        }

        // Step 1: Convert the negative number to a string
        String numberString = String.valueOf(number);

        // Step 2: Remove the negative sign from the string
        String numberWithoutSign = numberString.substring(1);

        // Step 3: Reverse the digits in the string
        String reversedString = new StringBuilder(numberWithoutSign).reverse().toString();

        // Step 4: Add the negative sign back to the reversed string
        String reversedNumberString = "-" + reversedString;

        // Step 5: Convert the reversed string to an integer
        int reversedNumber = Integer.parseInt(reversedNumberString);

        // Step 6: Return the reversed negative number as an integer
        return reversedNumber;
    }

    public static int reverseNegativeNumber2(int num) {
        if (num >= 0) {//if the number is not negative return as it is
            return num;
        }
        //Convert negative number to a string using Integer.toString(number)
        String numString = Integer.toString(num);

        //Create StringBuilder object to build the reversed string representation of the num
        //StringBuilder reversedString = new StringBuilder();
        //or String
        String reversedString = "";

        //Iterate through the characters of the number string in reverse order, starting from the second character(as the first character is the minus sign)
        for (int i = numString.length() - 1; i >= 1; i--) {
            //append each character to the reversedString object
            // reversedString.append(numString.charAt(i));
            reversedString += numString.charAt(i);
        }
        //convert reversedString back to an int using Integer.parseInt(reversedString.toString()) and multiply it by -1 to ensure the returned value is negative)
        return Integer.parseInt(reversedString.toString()) * -1;

    }
}

/*
Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */