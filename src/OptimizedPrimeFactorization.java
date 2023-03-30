public class OptimizedPrimeFactorization implements Runnable {

    private final int MAX_NUMBER = 1000000;
    private final PrimeNumberFinder primeNumberFinder;

    public OptimizedPrimeFactorization() {
        this.primeNumberFinder = new OptimizedPrimeNumberFinder() {
            @Override
            public boolean isPrimeNumber(int number) {
                return false;
            }
        };
    }

    @Override
    public void run() {
        for (int number = 2; number <= MAX_NUMBER; number++) {
            if (primeNumberFinder.isPrimeNumber(number)) {
                System.out.println("OptimizedPrimeFactorization found prime number: " + number);
            }
        }
    }

    private abstract class OptimizedPrimeNumberFinder implements PrimeNumberFinder {
    }
}
