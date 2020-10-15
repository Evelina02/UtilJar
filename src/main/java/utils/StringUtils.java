package utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {

        //null, empty - false
        if (NumberUtils.isCreatable(str)) {
            double number = NumberUtils.toDouble(str);

            if (number > 0) {
                return true;
            }
        }
        return false;
    }
}
