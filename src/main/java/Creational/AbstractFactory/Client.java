package Creational.AbstractFactory;

public class Client {
    private Car car;
    private MotorCycle motorCycle;

    public Client(VehicleFactory vehicleFactory) {
        this.car = vehicleFactory.createCar();
        this.motorCycle = vehicleFactory.createMotorCycle();
    }

    public void startJourney() {
        car.drive();
        motorCycle.ride();
    }

    public static void main(String args[]){
        Client teslaClient = new Client(new TeslaFactory());

        teslaClient.startJourney();

        System.out.println("***********");

        Client bmwClient = new Client(new BmwFactory());

        bmwClient.startJourney();
    }
}
