package DesignPatterns.StrategyDesignPattern.Vechile;

public class normalCar extends Vehicle{

    public normalCar() {
        super(new normalDriving(),new manualStart());
    }
}
