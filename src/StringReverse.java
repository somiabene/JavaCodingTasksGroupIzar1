public class StringReverse {
    public static void main(String[] args) {
        //write a return  method that can reverse String
        String str="apple";
        System.out.println("reverseString(str) = " + reverseString(str));
    }
    public static String reverseString(String str){
        String reverse="";//to store the reverse characters from the string
        for(int i=str.length()-1; i>=0; i--){
            reverse +=str.charAt(i);
        }
        return reverse;
    }
}
