package com.potebnya.StartJava.CodainBat.WarmUp1;

//Given a string, return true if the string starts with "hi" and false otherwise.
//
//
//        startHi("hi there") → true
//        startHi("hi") → true
//        startHi("hello hi") → false
public class startHi {
    public boolean startHi(String str) {
        if (str.length() <= 1){
            return false;
        }
        String StartTwo;
        StartTwo  = str.substring(0, 2);

        if(StartTwo.equals("hi") ){
            return true;

        }
        return false;
    }

}
