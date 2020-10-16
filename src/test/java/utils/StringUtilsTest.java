package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {

        assertTrue(StringUtils.isPositiveNumber("12.54"));
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("-15"));
        ;
    }
}