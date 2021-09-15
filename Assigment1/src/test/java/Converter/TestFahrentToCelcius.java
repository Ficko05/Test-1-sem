package Converter;

import org.junit.Test;

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

}
