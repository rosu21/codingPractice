import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionFibonacciNumbersTest {
    SolutionFibonacciNumbers solutionFibonacciNumbers = new SolutionFibonacciNumbers();




    @Test
    void fibTestZero() {
        assertEquals(0, solutionFibonacciNumbers.fib(0));
    }

    @Test
    void fibTestOne() {
        assertEquals(1, solutionFibonacciNumbers.fib(1));
    }

    @Test
    void fibTest() {
        assertEquals(3, solutionFibonacciNumbers.fib(4));
        assertEquals(5, solutionFibonacciNumbers.fib(5));
        assertEquals(8, solutionFibonacciNumbers.fib(6));
        assertEquals(13, solutionFibonacciNumbers.fib(7));

    }

}