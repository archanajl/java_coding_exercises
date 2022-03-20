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
        reverseSentence.append(sentence);
        return reverseSentence.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (User user: users){
            if (user.getType().equals("Linux")){
                count++;
            }
        }
        return count;
    }
}
