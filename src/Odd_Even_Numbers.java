public class Odd_Even_Numbers {
    public static void main(String[] args) {
    oddOrEven(-2);

        System.out.println(oddEven(-8));
    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
    public static int oddEven(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        return n;
    }
}



/*
identify(5) -> "Odd"
identify(6) -> "Even"
 */