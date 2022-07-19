package com.knubisoft.tasks.algorithm.charsinstring;

import java.util.Map;

public interface CharsInString {

    /**
     * Calculates count of chars in some string
     *
     * Upper case chars are not equals to lower case
     *
     * Spaces should be ignored
     *
     * @return Map with char and it's count in string
     */
    Map<Character, Integer> charactersCount(String text);

}
