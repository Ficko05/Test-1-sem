package Converter;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testRomanNumerals {


    @Test
    public void convertRomenNumerals1() {
        // Arrange
        romenNumeralConverter rnc = new romenNumeralConverter();
        // Act
        String result = rnc.convertRun(1);
        // Assert
        assertEquals(result,"I");
    }

    @Test
    public void convertRomenNumerals2() {
        // Arrange
        romenNumeralConverter rnc = new romenNumeralConverter();
        // Act
        String result = rnc.convertRun(2);
        // Assert
        assertEquals(result,"II");
    }
    @Test
    public void convertRomenNumerals55() {
        // Arrange
        romenNumeralConverter rnc = new romenNumeralConverter();
        // Act
        String result = rnc.convertRun(55);
        // Assert
        assertEquals(result,"LV");
    }
}
