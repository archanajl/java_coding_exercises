package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.List;


public class Exercise003 {
    final List<String> iceCream = new ArrayList<>();
    private String iceCreamFlavour;

    public Exercise003(){
        this.iceCream.add("Pistachio") ;
        this.iceCream.add("Raspberry Ripple") ;
        this.iceCream.add("Vanilla") ;
        this.iceCream.add("Mint Chocolate Chip") ;
        this.iceCream.add("Chocolate") ;
        this.iceCream.add("Mango Sorbet") ;
    }

    int getIceCreamCode(String iceCreamFlavour) {
        return this.iceCream.indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return this.iceCream.toArray(new String[0]);
    }

}
