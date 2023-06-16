import java.util.Arrays;
import java.util.TreeSet;

public class SameLetter {
    public static boolean sameLetter1(String a, String b) {
        char[] ch1 = a.toCharArray();//abc//convert string to an array
        char[] ch2 = b.toCharArray();//cba

        Arrays.sort(ch1);//abc
        Arrays.sort(ch2);//bca

        String a1="", a2="";
        
        for(char each: ch1)
            a1 +=each;

        for(char each: ch2)
            a2 +=each;

        return a1.equals(a2) ;
    }

    public static void main(String[] args) {
    String a="java";
    String b="apple";//java

        System.out.println("sameLetter1(a,b) = " + sameLetter1(a, b));


    }
    public static boolean sameLetter(String str1, String str2){
        str1=new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2=new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equalsIgnoreCase(str2);
    }
}
/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */