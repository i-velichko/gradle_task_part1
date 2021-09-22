import org.junit.jupiter.api.Test;
import org.velichko.gradle.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    private static final String CORRECT_STRING = "97";
    private static final String UNCORRECTED_STRING = "-3";

    @Test
    void isPositiveNumberTrue() {
        assertTrue(StringUtils.isPositiveNumber(CORRECT_STRING));
    }

    @Test
    void isPositiveNumberFalse() {
        assertFalse(StringUtils.isPositiveNumber(UNCORRECTED_STRING));
    }
}