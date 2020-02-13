public class BrokenPrimerNumber {
    void consumePrimes() throws InterruptedException {
        BlockingQueue<BigInteger> primes = ...;

        BrokenPrimeProducer producer = new BrokenPrimeProducer(primes);
        producer.start();

        try {
            while (needMorePrimes())
                consume(primes.take());
        } finally {
            producer.cancel();
        }
    }
}