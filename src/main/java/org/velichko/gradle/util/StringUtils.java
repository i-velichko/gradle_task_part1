package org.velichko.gradle.util;

import static org.apache.commons.lang3.math.NumberUtils.createNumber;
import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

/**
 * The type String utils.
 *
 * @author Ivan Velichko
 * @date 14.09.2021 20:08
 */
public class StringUtils {
    /**
     * Is positive number boolean.
     *
     * @param str the str
     * @return the boolean
     */
    public static boolean isPositiveNumber(String str) {
        Number anyNumber = 0;
        if (isCreatable(str)) {
            anyNumber = createNumber(str);
        } else {
            throw new IllegalArgumentException("Wrong input argument");
        }
        return anyNumber.doubleValue() > 0;
    }
}
