public class PrimeNumbers {

    public static boolean isPrime(int number){


        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {

// If the number is divisible by the current iteration value (number % i == 0), return false since it is not prime:
            if (number % i == 0) {
                return false;
            }
        }
// return true since the number has no divisors other than 1 and itself, making it a prime number:
        return true;
    }

    public static void main(String[] args) {
        int number = 8;

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
/*
Prime numbers  are whole numbers, >1 and can only be divided evenly by 1 and itself(have 2 factors)
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
//crucial for encryption
 */