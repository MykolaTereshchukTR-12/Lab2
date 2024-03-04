package org.example;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double Discriminator;

    public void SetParameters(double _a, double _b, double _c) {
        this.a = _a;
        this.b = _b;
        this.c = _c;
    }

    public String WhatDiscriminator() {
        this.Discriminator = (b * b) - (4 * a * c);
        if(Discriminator > 0){
            return "A quadratic equation with given coefficients has a solution ;)";
        } else {
            return "A quadratic equation with given coefficients hasn't a solution... :(";
        }
    }

    public double Negative() {
        return ((-b)-Math.sqrt(Discriminator))/(2 * a);
    }

    public double Positive() {
        return ((-b)+Math.sqrt(Discriminator))/(2 * a);
    }
}
