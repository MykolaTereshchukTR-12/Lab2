package org.example;

public class IndividualTask {
    private final double x;

    public IndividualTask(double _x) { this.x = _x; }

    public double Solution() {
        if(x > 1.1){
            return ( Math.sqrt( Math.abs(x - 15)));
        } else if(x <= 1.1 && x >= -3.5) {
            return ( Math.log( Math.abs( Math.sqrt( Math.cos(x)) - Math.cbrt( Math.sin(x - 1)))) / Math.log(3));
        } else {
            return ( 1/x + (Math.sin(x) * Math.sin(x)) - Math.cbrt( Math.cos(1 + (x * x))));
        }
    }
}
