package com.example.homework2_12;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private double num1;
    private double num2;
    private double num2Zero;
    private CalculatorService cs;
    @BeforeEach
    public void sutUp(){
        num1 = 3.4d;
        num2 = 5.5d;
        num2Zero = 0;
        cs = new CalculatorService();
    }

    @Test
    public void add(){
        double actual = cs.plus(num1, num2);
        double expected = num1 + num2;
        assertEquals(actual, expected);
    }
    @Test
    public void minus(){
        double actual = cs.minus(num1, num2);
        double expected = num1 - num2;
        assertEquals(actual, expected);
    }
    @Test
    public void multiply(){
        double actual = cs.multiply(num1, num2);
        double expected = num1 * num2;
        assertEquals(actual, expected);
    }
    @Test
    public void divide(){
        double actual = cs.divide(num1, num2);
        double expected = num1 / num2;
        assertEquals(actual, expected);
    }
    @Test
    public void divideWithException(){
        assertThrows(IllegalArgumentException.class, () -> cs.divide(num1, num2Zero));
    }
}
