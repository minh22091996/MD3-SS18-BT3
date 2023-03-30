public class LazyPrimeFactorization implements Runnable {

    private final int MAX_NUMBER = 1000000;
    private final PrimeNumberFinder primeNumberFinder;

    public LazyPrimeFactorization() {
        this.primeNumberFinder = (PrimeNumberFinder) new LazyPrimeFactorization();
    }

    @Override
    public void run() {
        for (int number = 2; number <= MAX_NUMBER; number++) {
            if (primeNumberFinder.isPrimeNumber(number)) {
                System.out.println("LazyPrimeFactorization found prime number: " + number);
            }
        }
    }
}

