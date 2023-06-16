public class String_FindTheUnique {
    //write a return method that can find the unique characters from the String

    public static void main(String[] args) {
        String str = "abbbvcccddd";
        System.out.println("findTheUnique(str) = " + findTheUnique(str));
    }

    public static String findTheUnique(String str) {
        String unique = "";//initialize empty string to store the unique characters found in input string

        for (int i = 0; i < str.length(); i++) { // i index number of str, iterate over each character in input string
            char each = str.charAt(i);//within the loop, the code retrieves the character at the current index i using the charAt method and assigns it to the variable each.
            if (str.indexOf(each) == str.lastIndexOf(each)) {//The code then checks if the index of the first occurrence of each in str is equal to the index of the last occurrence of each in str. If they are equal, it means that each appears only once in the string, making it a unique character.
                unique += each;//If each is determined to be a unique character, it is concatenated to the unique string using the += operator.
            }
        }
        return unique;//After the loop completes, the unique string will contain all the unique characters found in the original string.
       // Finally, the method returns the unique string.

    }
}



