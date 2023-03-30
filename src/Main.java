public class Main {
    public static void main(String[] args) {
        for (int number = 2; number <= MAX_NUMBER; number++) {
            if (primeNumberFinder.isPrimeNumber(number)) {
                System.out.println("OptimizedPrimeFactorization found prime number: " + number);
            }
        }
    }
    }
}