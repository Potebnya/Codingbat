package com.potebnya.StartJava.CodainBat.WarmUp1;
//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
//
//
//        loneTeen(13, 99) → true
//        loneTeen(21, 19) → true
//        loneTeen(13, 13) → false
public class loneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aTeen = false;
        boolean bTeen = false;

        if(a == b ){
            return false;
        }

        if (a >= 13 && a <= 19){
            aTeen = true;
        }
        if (b >= 13 && b <= 19){
            bTeen = true;
        }

        if(aTeen && bTeen){
            return false;
        }
        return true;
    }

}

