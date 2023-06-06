package com.example.homework2_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorControllerTest {
    private double num1;
    private double num2;
    private double num2Zero;
    private CalculatorController cc;
    private CalculatorService cs;

    @BeforeEach
    public void setUp(){
        num1 = 3.4d;
        num2 = 4.7d;
        num2Zero = 0d;
        cs = new CalculatorService();
        cc = new CalculatorController(cs);

    }

    @Test
    public void helloTest(){
        String actual = cc.hello();
        String expected = "<h1>Приветствую в калькуляторе</h1>";
        assertEquals(actual, expected);
    }
    @Test
    public void isPlusWork(){
        String actual = cc.plus(num1, num2);
        String expected ="<h1>" +  num1 + " + " + num2 + " = " + cs.plus(num1, num2) + "</h1>";
        assertEquals(actual, expected);
    }
    @Test
    public void isMinusWork(){
        String actual = cc.minus(num1, num2);
        String expected ="<h1>" +  num1 + " - " + num2 + " = " + cs.minus(num1, num2) + "</h1>";
        assertEquals(actual, expected);
    }
    @Test
    public void multiply(){
        String actual = cc.multiply(num1, num2);
        String expected ="<h1>" +  num1 + " x " + num2 + " = " + cs.multiply(num1, num2) + "</h1>";
        assertEquals(actual, expected);
    }
    @Test
    public void divide(){
        String actual = cc.divide(num1, num2);
        String expected ="<h1>" +  num1 + " : " + num2 + " = " + cs.divide(num1, num2) + "</h1>";
        assertEquals(actual, expected);
    } @Test
    public void divideWithException(){
        assertThrows(RuntimeException.class, () -> cc.divide(num1, num2Zero));
    }
}
