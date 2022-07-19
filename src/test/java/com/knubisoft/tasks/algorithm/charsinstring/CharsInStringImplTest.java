package com.knubisoft.tasks.algorithm.charsinstring;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharsInStringImplTest {

    private final CharsInString charsInString = new CharsInStringImpl();

    @Test
    void charactersCount() {
        for (int x = 0; x < 50; x++) {
            Pair<String, Map<Character, Integer>> result = generateSeq();
            result.getRight().remove(' ');
            assertEquals(charsInString.charactersCount(result.getLeft()), result.getRight());
        }
    }

    private Pair<String, Map<Character, Integer>> generateSeq() {
        Random random = new Random();
        String setOfCharacters = "abcdefghxyz1234567-/@ansbdjh123uiy1i1290389!@#$%^&*()<>:L ";
        Map<Character, Integer> expected = new HashMap<>();
        StringBuilder b = new StringBuilder();
        for (int index = 0; index < 50; index++) {
            char randomChar = setOfCharacters.charAt(random.nextInt(setOfCharacters.length()));

            if (expected.containsKey(randomChar)){
                Integer v = expected.get(randomChar);
                expected.put(randomChar, v + 1);
            } else {
                expected.put(randomChar, 1);
            }

            b.append(randomChar);
        }
        return Pair.of(b.toString(), expected);
    }
}