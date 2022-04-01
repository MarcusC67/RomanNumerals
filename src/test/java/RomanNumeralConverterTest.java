package RomanNumerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

    @ParameterizedTest
    @CsvSource(value = {"I:1","II:2","III:3","IV:4","V:5","VI:6","VII:7","VIII:8","IX:9","X:10"}, delimiter = ':')
    public void checkRomanNumeralI(String input, int expected) {
        // Arrange - setting up the objects needed for tests
        RomanNumerals.Roman ex001 = new RomanNumerals.Roman(input);
        // Act and assert
        assertEquals(expected, ex001.romanToDecimal());
    }

}
