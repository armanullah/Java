import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberMethodTest {

    @org.junit.Test
    public void isPrime() {
        PrimeNumberMethod prime = new PrimeNumberMethod();
        assertTrue(prime.isPrime(3));
    }

    @Test
    public void isPrime1() {
        PrimeNumberMethod prime = new PrimeNumberMethod();
        assertFalse(prime.isPrime(4));
    }
}