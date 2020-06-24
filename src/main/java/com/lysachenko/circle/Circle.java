package com.lysachenko.tasks;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Incorrect radius! Default 0. Please set correct radius!");
        }
    }

    public double getSquare() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Incorrect radius! Radius set to default value");
        }
    }
}
