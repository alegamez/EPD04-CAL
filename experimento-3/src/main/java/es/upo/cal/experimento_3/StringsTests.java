package es.upo.cal.experimento_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringsTests {

	@Test
    public void testStringLength() {
        // Prueba para comprobar la longitud de una cadena
        String myString = "Hello, World!";
        int expectedLength = 13;
        int actualLength = myString.length();
        Assert.assertEquals(actualLength, expectedLength, "La longitud de la cadena no es la esperada");
    }

    @Test
    public void testStringConcatenation() {
        // Prueba para comprobar la concatenación de cadenas
        String str1 = "Hello";
        String str2 = " World!";
        String expectedResult = "Hello World!";
        String actualResult = str1 + str2;
        Assert.assertEquals(actualResult, expectedResult, "La concatenación de cadenas no es la esperada");
    }

    @Test
    public void testStringSubstring() {
        // Prueba para comprobar la extracción de subcadena
        String originalString = "Hello, World!";
        String expectedSubstring = "World";
        String actualSubstring = originalString.substring(7, 12);
        Assert.assertEquals(actualSubstring, expectedSubstring, "La subcadena no es la esperada");
    }

    @Test
    public void testStringContains() {
        // Prueba para comprobar si una cadena contiene otra
        String mainString = "Hello, World!";
        String subString = "World";
        boolean containsSubstring = mainString.contains(subString);
        Assert.assertTrue(containsSubstring, "La cadena no contiene la subcadena");
    }

  

}