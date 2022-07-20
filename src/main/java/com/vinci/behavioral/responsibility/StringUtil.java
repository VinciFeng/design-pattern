package com.vinci.behavioral.responsibility;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        if (str.isEmpty() || str.isBlank()) {
            return true;
        }
        return false;
    }
}
