package org.example;

public class Points {
    private final double x;
    private final double y;

    public Points(double _x, double _y) {
        this.x = _x;
        this.y = _y;
    }

    public String IsItNull() {
        if(x == 0.0f || y == 0.0f) {
            return "This point lies on the abscissa/ordinate axes.";
        } else {
            return Quarter();
        }
    }

    public String Quarter() {
        String line = "Our point belongs to ...";
        if(x > 0){
            if(y > 0) {
                return line + "first quarter!";
            } else {
                return line + "fourth quarter!";
            }
        } else {
            if(y > 0) {
                return line + "second quarter!";
            } else {
                return line + "third quarter";
            }
        }
    }
}
