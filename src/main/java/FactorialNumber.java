public class FactorialNumber {
    public static void main(String[] args) {
        long number = 25; // Change this to calculate factorial for a different number
        System.out.println("Factorial of " + number + " = " + factorial(number));
    }

    public static long factorial(long n) {
        if (n==1){
            return 1;
        }
        else {
            return (n * factorial(n - 1));
        }
    }
}

