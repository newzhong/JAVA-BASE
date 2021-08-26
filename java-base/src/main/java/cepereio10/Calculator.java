package cepereio10;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * <b>功能描述:</b><br>
 * @author newzhong
 * @version 1.0.0
 * @Note <b>创建时间:</b> 2021-05-07 14:24
 * @since JDK 1.8
 */
public class Calculator {
    public BigInteger add(BigInteger num1, BigInteger num2){
        return num1.add(num2);
    }
    public int Subtraction(int num1, int num2){
        return num1 - num2;
    }

    /***
     * 除法
     * @param num1
     * @param num2
     * @return
     */
    public BigDecimal division(BigDecimal num1, BigDecimal num2){

        try {
            return num1.divide(num2);
        } catch (ArithmeticException  e) {
            e.printStackTrace();
            return null;
        }
    }
    public BigDecimal multiplication(BigDecimal num1, BigDecimal num2){
        return num1.multiply(num2);
    }



}