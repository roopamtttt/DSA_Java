package DesignPatterns.StrategyDesignPattern.Vechile;

public class spotCar extends Vehicle{
    public spotCar() {
        super(new sportCarDriveing(), new PushButtonStart());
    }
}
