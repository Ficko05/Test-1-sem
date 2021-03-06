package Converter;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;




public class TestFahrentToCelcius {

    @Test
    public void testFahrentToCel() {
        // Arrange
        fahrentToCelsius f2C = new fahrentToCelsius();
        // Act
        double result = f2C.farhToCel(1);
        // Assert
        assertEquals(-17.22,result);
    }

    @Test
    public void test() {
        // Arrange
        fahrentToCelsius f2C = new fahrentToCelsius();
        // Act
        double result = f2C.farhToCel(90);
        // Assert
        assertEquals(32.22,result);
    }


   @ParameterizedTest
   @CsvSource({"90,32.22","1,-17.22" })
   public void testParam(double input, double expected){

       fahrentToCelsius f2C = new fahrentToCelsius();

       double result = f2C.farhToCel(input);

       assertEquals(expected,result);
   }


}
