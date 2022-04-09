package com.potebnya.StartJava.CodainBat.WarmUp1;

//Return true if the given string contains between 1 and 3 'e' chars.
//
//
//        stringE("Hello") → true
//        stringE("Heelle") → true
//        stringE("Heelele") → false
public class stringE {
    public boolean stringE(String str) {
        int e = 0;
        for (char element : str.toCharArray()) {
            if (element == 'e') e = e + 1;

        }
        if (e == 1 || e == 3 || e == 2) {
            return true;
        }
        return false;
    }
}
