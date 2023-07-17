public class DivideWithoutOperator {
    public static void main(String[] args) {
        divideWithoutDivisionOperator(9, 4);
        System.out.println(divisionWithoutOperator(9,4));
    }


/*
    Write a method that can divide two numbers without using division operator
     */

    public static void divideWithoutDivisionOperator(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }

    public static String divisionWithoutOperator(int n1, int n2) {
        if (n2 == 0) {
            System.err.println("Invalid number");
            System.exit(1);
        }
        int count = 0;
        while (n1 >= n2) {
            n1 -= n2;
            count++;
        }
        return count+" remainder "+n1;
    }
}



