package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    void divisionByZeroShouldThrowException() {

        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    void normalDivisionShouldReturnCorrectResult() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.divide(10, 2));
    }

}
