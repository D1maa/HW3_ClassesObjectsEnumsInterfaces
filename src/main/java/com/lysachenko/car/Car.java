package com.lysachenko.tasks;

public class Car {

    private final String model;
    private boolean start;
    private double speed;

    public Car(String model) {
        this.model = model;
        this.start = false;
    }

    public void start() {
        if (start) {
            System.out.println("Car is already running!");
        } else {
            start = true;
            System.out.println("Car engine is running now");
        }
    }

    public void stop() {
        if (!start) {
            System.out.println("Car engine is already stopped!");
        } else {
            start = false;
            System.out.println("Car engine is stopped");
        }
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public void speed(double wantedSpeed, double acceleration) {
        if (acceleration > 0 && wantedSpeed > 0) {
            if (start) {
                if (this.speed != wantedSpeed) {
                    if (this.speed == 0) {
                        System.out.println("Car is stop");
                    }
                    if (this.speed < wantedSpeed) {
                        speedUp(wantedSpeed, acceleration);
                    } else {
                        speedDown(wantedSpeed, acceleration);
                    }
                } else {
                    System.out.println("Speed car is " + this.speed + " km/h now.");
                }
            } else {
                System.out.println("Start the engine, please!");
            }
        } else {
            System.out.println("Enter correct speed or acceleration!");
        }
    }

    private void speedUp(double wantedSpeed, double acceleration) {
        System.out.println("Car speeds up to - " + wantedSpeed + " km/h with an acceleration of " + acceleration + " km/h^2:");

        while (this.speed != wantedSpeed) {
            if (this.speed + acceleration > wantedSpeed) {
                acceleration = wantedSpeed - this.speed;
            }

            this.speed += acceleration;
            System.out.println("\tCurrent speed: " + this.speed + " km/h");
        }
    }

    private void speedDown(double wantedSpeed, double acceleration) {
        System.out.println("Car speeds down to - " + wantedSpeed + " km/h with an acceleration of -" + acceleration + " km/h^2:");

        while (this.speed != wantedSpeed) {
            if (this.speed - acceleration < wantedSpeed) {
                acceleration = this.speed - wantedSpeed;
            }

            this.speed -= acceleration;
            System.out.println("\tCurrent speed: " + this.speed + " km/h");
        }
    }
}
