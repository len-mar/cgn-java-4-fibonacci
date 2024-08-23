import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,0",
                    "1,1",
                    "2,1",
                    "3,2",
                    "6,8",
                    "7,13",
                    "37,24157817",
                    "49,7778742049"
            }
    )
    void testFibonacci(int number, long expected){
        assertEquals(Fibonacci.fibonacci(number), expected);
    }
}
