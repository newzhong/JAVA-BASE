package cepereio10;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
   private static Calculator calculatort = new Calculator();
    @Test
    public void add() {
        BigInteger add = calculatort.add(new BigInteger(String.valueOf(11111)),
                                        new BigInteger(String.valueOf(11111)));
        assertEquals(3,add);

    }

    @Test
    public void subtraction() {
        int subtraction = calculatort.Subtraction(4, 2);
        assertEquals(3,subtraction);
    }

    @Test
    public void division() {
        BigDecimal division = calculatort.division(new BigDecimal(String.valueOf(11111)),
                new BigDecimal(String.valueOf(1)));
        assertEquals(3,division);
    }

    @Test
    public void multiplication() {
        BigDecimal multiplication = calculatort.multiplication(new BigDecimal(String.valueOf(22)),
                new BigDecimal(String.valueOf(1)));
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(22));
        assertEquals(bigDecimal,multiplication);
    }
    @Test
    public void divide1() {
        int a = 16;
        int b = 4;
        System.out.println(a/b);
        System.out.println(a>>b);
    }
}