package com.potebnya.StartJava.CodainBat.WarmUp1;
//Given a string, return a new string where the first and last chars have been exchanged.
//
//
//        frontBack("code") → "eodc"
//        frontBack("a") → "a"
//        frontBack("ab") → "ba"

public class frontBack {
    public String frontBack(String str) {
        if(str.length() <=1){
            return str;
        }
        char first;
        char last;
        first = str.charAt(0);
        last = str.charAt(str.length()-1);
        str = str.substring(1, str.length() -1);
        str = last + str + first;
        return str;
    }
}
