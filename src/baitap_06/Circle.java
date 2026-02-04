package baitap_06;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double diameter, boolean isDiameter) {
        if (isDiameter) {
            this.radius = diameter / 2;
        } else {
            this.radius = diameter;
        }
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}