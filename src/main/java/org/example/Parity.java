package org.example;

public class Parity {
    private final  int a;

    public Parity(int _a) {
        this.a = _a;
    }

    public String WhatParity() {
        if(a % 2 == 0){
            return "The specified number is even! Also ";
        } else {
            return "The specified number isn't even! Also ";
        }
    }

    public String WhatAmbiguity() {
        if(a < 100 && a > 9){
            return "the specified number is two-digit.";
        } else {
            return "the specified number isn't two-digit.";
        }
    }
}
