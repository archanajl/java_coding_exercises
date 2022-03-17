package com.techreturners.exercise005;
import java.util.HashMap;
import java.util.Locale;

public class Exercise005 {

    public boolean isPangram(String input) {
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        if (input.equals("")) {
            return false;
        }
        input = input.replaceAll("[-+^ 0-9]*", "").toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if (!alphabetMap.containsKey(currentCharacter)) {
                alphabetMap.put(currentCharacter, 1);
            }
            if (alphabetMap.size() == 26) {
                return true;
            }
        }
        return false;
    }
}



