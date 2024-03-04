//Write a Java program that illustrates the concepts of interfaces, method overriding, and method overloading. Begin by defining an interface named Vehicle with two abstract methods:accelerate() and brake(). Then, create two classes, Car and Bicycle, both of which implement the Vehicle interface. In the Car class, override the accelerate() and brake() methods to print appropriate messages indicating the acceleration and braking actions for a car. Similarly, in the Bicycle class, override the same methods to display messages specific to a bicycle's acceleration and braking. Additionally, implement method overloading in both classes by providing multiple versions of the accelerate() method, each accepting different parameters such as speed and duration. Finally, create a Main class to instantiate objects of both Car and Bicycle classes, test their overridden methods, and demonstrate method overloading by invoking different versions of the accelerate() method.

interface Vehicle
{
    void accelerate();
    void brake();
}

class Car implements Vehicle
{
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " mph...");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " mph over " + duration + " seconds...");
    }

    public void brake() {
        System.out.println("Car is braking...");
    }
}

class Bicycle implements Vehicle
{
    public void accelerate() {
        System.out.println("Bicycle is pedaling...");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is pedaling to reach " + speed + " mph...");
    }

    public void brake() {
        System.out.println("Bicycle is slowing down...");
    }
}

class Main69
{
    public static void main(String[] args)
    {
        Car myCar = new Car();
        Bicycle myBicycle = new Bicycle();

        System.out.println("Car:");
        myCar.accelerate();
        myCar.accelerate(60);
        myCar.accelerate(80, 5);
        myCar.brake();

        System.out.println("\nBicycle:");
        myBicycle.accelerate();
        myBicycle.accelerate(40);
        myBicycle.brake();
    }
}

/*
Car:
Car is accelerating.
Car is accelerating at speed: 60 km/h.
Car is accelerating at speed: 80 km/h for 5 seconds.
Car is braking.

Bicycle:
Bicycle is pedaling faster.
Bicycle is pedaling faster at speed: 40 km/h.
Bicycle is applying brakes.
 */