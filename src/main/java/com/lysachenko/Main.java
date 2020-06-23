package com.lysachenko;

public class Main {

    public static void main(String[] args) {

        /*Circle circle = new Circle(-5);
        circle.setRadius(-5);
        System.out.println("Square of circle = " + circle.getSquare());*/

        /*new SecondTask();
        new SecondTask();
        new SecondTask();
        new SecondTask();
        new SecondTask();
        new SecondTask();
        new SecondTask();
        new SecondTask();

        System.out.println("\nCount of objects of the class \"Second Task\" = " + SecondTask.getCount());*/

        Car car = new Car("Porsche 911");

        System.out.println("\nModel: " + car.getModel());
        car.start();
        car.speed(200.5, 45.36);
        System.out.println("Current car speed = " + car.getSpeed() + " km/h");
        car.speed(120, 23.7);
        car.stop();

    }

}
