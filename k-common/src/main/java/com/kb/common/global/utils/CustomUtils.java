package com.kb.common.global.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class CustomUtils {

    /* compare */
    /**
     * <p>value 가 anotherValue 값이 같으면 return true</p>
     *
     * @param value
     * @param anotherValue
     * @return boolean
     */
    public static boolean isEqual(Object value, Object anotherValue) {
        return compare(value, anotherValue) == 0;
    }

    /**
     * <p>value 가 anotherValue 보다 크면 return true</p>
     *
     * @param value
     * @param anotherValue
     * @return boolean
     */
    public static boolean isGreaterThan(Object value, Object anotherValue) {
        return compare(value, anotherValue) > 0;
    }

    /**
     * <p>value 가 anotherValue 보다 크거나 같으면 return true</p>
     *
     * @param value
     * @param anotherValue
     * @return boolean
     */
    public static boolean isGreaterEqualThan(Object value, Object anotherValue) {
        return compare(value, anotherValue) >= 0;
    }

    /**
     * <p>value 가 anotherValue 보다 작으면 return true</p>
     *
     * @param value
     * @param anotherValue
     * @return boolean
     */
    public static boolean isLessThan(Object value, Object anotherValue) {
        return compare(value, anotherValue) < 0;
    }

    /**
     * <p>value 가 anotherValue 보다 작거나 같으면 return true</p>
     *
     * @param value
     * @param anotherValue
     * @return boolean
     */
    public static boolean isLessEqualThan(Object value, Object anotherValue) {
        return compare(value, anotherValue) <= 0;
    }

    private static int compare(Object value, Object anotherValue) {
        if(value == null || anotherValue == null) {
            throw new IllegalArgumentException(
                String.format("Null value not allowd [%s,%s]", value, anotherValue));
        }
        if(value.getClass().getName().equals(anotherValue.getClass().getName())) {
            throw new IllegalArgumentException("Different types cannot compared");
        }

        if (value instanceof Integer) {
            return ((Integer) value).compareTo((Integer) anotherValue);
        } else if (value instanceof Long) {
            return ((Long) value).compareTo((Long) anotherValue);
        } else if (value instanceof Float) {
            return ((Float) value).compareTo((Float) anotherValue);
        } else if (value instanceof Double) {
            return ((Double) value).compareTo((Double) anotherValue);
        } else if (value instanceof String) {
            return ((String) value).compareTo((String) anotherValue);
        } else if (value instanceof BigInteger) {
            return ((BigInteger) value).compareTo((BigInteger) anotherValue);
        } else if (value instanceof BigDecimal) {
            return ((BigDecimal) value).compareTo((BigDecimal) anotherValue);
        } else {
            throw new IllegalArgumentException(
                String.format("This type is not supported. [%s]", value.getClass().getName()));
        }
    }

    /**
     * <p>value 가 Args 중 값이 있으면 true</p>
     * contains("AB", "ab","ABCD","0ABD") return true
     * contains("ab","ABCD","0ABD") return false
     *
     * @param value
     * @param args
     * @return boolean
     * */
    public static boolean contains(String value, String... args) {
        return Arrays.asList(args).contains(value);
    }

    /* log */
    public static void logObjToJson(Object obj) {
      log.info("{} >> {}",
          Thread.currentThread().getStackTrace()[2].getLineNumber(), toJson(obj));
    }

    /* json */
    public static String toJson(Object obj) {
        return JsonUtils.toJson(obj);
    }

    /* BigDecimal */
    public static BigDecimal toBigDecimal(Integer val) {
        return toBigDecimal(BigDecimal.valueOf(val));
    }

    public static BigDecimal toBigDecimal(Double val) {
        return toBigDecimal(BigDecimal.valueOf(val));
    }

    public static BigDecimal toBigDecimal(BigDecimal val) {
        return new BigDecimal(val.stripTrailingZeros().toPlainString());
    }

}
