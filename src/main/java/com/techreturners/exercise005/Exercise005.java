package com.techreturners.exercise005;
import java.util.HashSet;

public class Exercise005 {

    public boolean isPangram(String input) {
        HashSet<Character> alphabetSet = new HashSet<>();
        input = input.replaceAll("[-+^ 0-9]*", "").toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            alphabetSet.add(currentCharacter);
            if (alphabetSet.size() == 26) {
                return true;
            }
        }
        return false;
    }
}



