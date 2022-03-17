package com.techreturners.exercise001;

import java.util.List;
import java.util.Locale;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1) + '.' +  lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double calculatedVat = ((vatRate/100) * originalPrice)  + originalPrice;
        return Math.floor(calculatedVat * 100)/100;
    }

    public String reverse(String sentence) {

        StringBuilder reverseSentence = new StringBuilder();

        String[] words = sentence.split("\\s+");
        for (int i = words.length - 1 ; i >= 0; i--){
            for (int j = words[i].length() - 1 ; j >= 0; j--) {
                reverseSentence.append(words[i].charAt(j));
            }
            if (i != 0){
                reverseSentence.append(" ");
            }
        }
        return reverseSentence.toString();
    }

    public int countLinuxUsers(List<User> users) {

        int count = 0;
            for (User i: users){
            if (i.getType().equals("Linux")){
                count++;
            }
        }
        return count;
    }
}
