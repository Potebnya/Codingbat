package com.potebnya.StartJava.CodainBat.WarmUp1;

//
//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//
//        startOz("ozymandias") → "oz"
//        startOz("bzoo") → "z"
//        startOz("oxx") → "o"
public class startOz {
    public String startOz(String str) {

        if (str.length() <= 1) {
            return str;
        }

        String strMix = str.substring(0, 2);
        if (strMix.equals("oz")) {
            return strMix;
        }
        String first = str.substring(0, 1);
        String second = str.substring(1, 2);
        if (first.equals("z")) {
            return first;
        } else if (first.equals("o")) {
            return first;
        } else if (second.equals("z")) {
            return second;
        } else if (second.equals("o")) {
            return second;
        }
        return "";
    }
}
