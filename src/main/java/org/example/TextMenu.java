package org.example;

public class TextMenu {
    private double a;
    private double b;

    public TextMenu(double _a, double _b) {
        this.a = _a;
        this.b = _b;
    }

    public TextMenu() {}

    public String menu(int _i) {
        return switch (_i) {
            case 1 -> "The product of this two real numbers is " + (a * b) + ";";
            case 2 -> "The sum of this two real numbers is " + (a + b) + ";";
            case 3 -> "The difference of this two real numbers is" + (a - b) + ".";
            default -> "...";
        };
    }

    public String massage(int _s) {
        return switch (_s) {
            case 1 -> "Good day, dear user! I am glad to welcome you to the new work session!";
            case 2 -> "Do you want to get started?";
            case 3 -> "It was nice to work. I suggest to complete the work and continue next time.";
            default -> "...";
        };
    }
}