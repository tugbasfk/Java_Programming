package m25_class_and_objects;

public class Car {

    /*
    REQUIREMENTS:

    create a custom class name Car, with the following fields and actions:

    Fields: make, model, year,color, price

    Actions:
        start(): will print: "$make $model is starting."
        drive(): will print: "$make $model is driving."
        stop(): will print: "$make $model is stopping."

        showCurrentSpeed(currentSpeed, speedLimit): compare the current speed with the speed limit, and print:
        "Maker is driving at $currentSpeed, following the $speedLimit."

        But if the currentSpeed is higher than the speedLimit, print:
        "Maker is driving at$currentSpeed, over the speedLimit."
     */


    public String make, model; //instance variables -> both are string, so I use public(access modifier) & String
    public int year;
    public String color; //these are instance since multiple copies are needed since diff cars have diff colors
    public double price;

    //instance methods so I can call it  separately from the object and each object has a separate copy

    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }

    public void stop() {
        System.out.println(make + " " + model + " is stopping.");
    }

    public void showCurrentSpeed(int currentSpeed, int speedLimit) {
        if (currentSpeed <= speedLimit) {
            System.out.println(make + " is driving at " + currentSpeed + ", following the " + "speed limit" + " " + speedLimit + ".");
        } else {
            System.out.println(make + " is driving at " + currentSpeed +" " + "over the " + "speed limit" + " " + speedLimit);
        }
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}


