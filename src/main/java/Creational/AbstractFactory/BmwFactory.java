package Creational.AbstractFactory;

public class BmwFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new BmwCar();
    }

    @Override
    public MotorCycle createMotorCycle() {
        return new BmwMotorCycle();
    }
}
