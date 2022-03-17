package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person ) {
        String city = person.getCity();
        return city.equals("Manchester");
    }

    public boolean canWatchFilm( Person person, int ageLimit) {
        return person.getAge() >= ageLimit;
    }
    
}
