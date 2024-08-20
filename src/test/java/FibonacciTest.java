import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    @Test
    void fibonacciShouldReturn0When0(){
        // GIVEN
        long n = 0;
        long expected = 0;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void fibonacciShouldReturn1When1(){
        // GIVEN
        long n = 1;
        long expected = 1;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }
    @Test
    void fibonacciShouldReturn1When2(){
        // GIVEN
        long n = 2;
        long expected = 1;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void fibonacciShouldReturn2When3(){
        // GIVEN
        long n = 3;
        long expected = 2;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void fibonacciShouldReturn3When4(){
        // GIVEN
        long n = 4;
        long expected = 3;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void fibonacciShouldReturn5When5(){
        // GIVEN
        long n = 5;
        long expected = 5;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void fibonacciShouldReturn8When6(){
        // GIVEN
        long n = 6;
        long expected = 8;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void fibonacciShouldReturn13When7(){
        // GIVEN
        long n = 7;
        long expected = 13;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

    // higher numbers
    @Test
    void fibonacciShouldReturn24157817When37(){
        // GIVEN
        long n = 37;
        long expected = 24157817;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

    @Test
    void fibonacciShouldReturn7778742049When49(){
        // GIVEN
        long n = 49;
        long expected = 7778742049L;
        // WHEN
        long actual = Fibonacci.fibonacci(n);
        // THEN
        assertEquals(actual, expected);
    }

}
