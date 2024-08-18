package Creational.AbstractFactory;

public class TeslaFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new TeslaCar();
    }

    @Override
    public MotorCycle createMotorCycle() {
        return new TeslaMotorCycle();
    }
}
