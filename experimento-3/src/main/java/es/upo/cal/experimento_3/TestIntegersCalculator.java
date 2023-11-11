package es.upo.cal.experimento_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegersCalculator {

    private IntegersCalculator calculator = new IntegersCalculator();

    @Test
    public void testAddition() {
        // Prueba para comprobar la adición
        int a = 5;
        int b = 7;
        int expectedResult = 12;
        int actualResult = calculator.add(a, b);
        Assert.assertEquals(actualResult, expectedResult, "La suma no es la esperada");
    }

    @Test
    public void testSubtraction() {
        // Prueba para comprobar la substracción
        int a = 10;
        int b = 3;
        int expectedResult = 7;
        int actualResult = calculator.substraction(a, b);
        Assert.assertEquals(actualResult, expectedResult, "La resta no es la esperada");
    }

    @Test
    public void testMultiplication() {
        // Prueba para comprobar la multiplicación
        int a = 4;
        int b = 6;
        int expectedResult = 24;
        int actualResult = calculator.multiplication(a, b);
        Assert.assertEquals(actualResult, expectedResult, "La multiplicación no es la esperada");
    }

    @Test
    public void testDivision() {
        // Prueba para comprobar la división
        int a = 15;
        int b = 3;
        int expectedResult = 5;
        int actualResult = calculator.division(a, b);
        Assert.assertEquals(actualResult, expectedResult, "La división no es la esperada");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        // Prueba para comprobar la división por cero
        int a = 10;
        int b = 0;
        calculator.division(a, b); // Debe arrojar una excepción ArithmeticException
    }
}