class Vehical {
    void start(){
        System.out.println("Vehical Start");
    }
}
class Car extends Vehical{
    void drive(){
        System.out.println("Car Drive");
    }
}
class Bike extends Vehical{
    void ride(){
        System.out.println("Bike Ride");
    }
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        c.drive();

        b.start();
        b.ride();
    }
}