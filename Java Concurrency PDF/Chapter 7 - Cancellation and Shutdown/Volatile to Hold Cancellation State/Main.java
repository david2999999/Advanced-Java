public class Main {
    List<BigInteger> aSecondOfPrimes() throws InterruptedException {
        PrimeGenerator generator = new PrimeGenerator();
        new Thread(generator).start();
        
        try {
            SECONDS.sleep(1);
        } finally {
            generator.cancel();
        }
        return generator.get();
    }
    
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