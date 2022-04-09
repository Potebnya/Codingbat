package com.potebnya.StartJava.CodainBat.WarmUp1;

//
//Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
//
//        mixStarLt("mix snacks") → true
//        mixStart("pix snacks") → true
//        mixStart("piz snacks") → false
public class mixStart {
    public boolean mixStart(String str) {
        if (str.length() <= 2) {
            return false;
        }

        String strMix = str.substring(1, 3);
        if (strMix.equals("ix")) {
            return true;
        }
        return false;
    }

}
