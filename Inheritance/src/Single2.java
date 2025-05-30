class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Riding the bike...");
    }
}

public class Single2{
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start();
        myBike.ride();
        myBike.stop();
    }
}
