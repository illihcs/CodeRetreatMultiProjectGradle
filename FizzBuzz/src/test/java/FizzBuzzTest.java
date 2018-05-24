import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    @Test
    public void fizztest() {
        assertTrue("3 müsste Fizz sein", fizzrun()[3].equals("Fizz"));
    }

    private String[] fizzrun() {
        return new FizzBuzz().fizzbuzz();
    }
}
