package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.CountNumberOfString;

public class CountNumberOfStringTest {
   
    @Test
    void testGetInputStringLength() {
        int expected = 6;
        String str = "Vishal";
        int actual = CountNumberOfString.getInputStringLength(str);
        assertEquals(expected, actual);
    }

   
}
