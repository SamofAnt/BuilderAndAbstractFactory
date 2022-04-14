package org.itstep.msk.builders;

import org.itstep.msk.cars.Car;
import org.itstep.msk.cars.CarType;
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private String model;
    private String engine;
    private int amountDoors;

    @Override
    public Builder buildCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public Builder buildSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder buildModel(String model){
        this.model = model;
        return this;
    }

    @Override
    public Builder buildEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder buildDoors(int amountDoors) {
        this.amountDoors = amountDoors;
        return this;
    }
    @Override
    public Car getResult() {
        return new Car(type, seats,model, engine, amountDoors);
    }
}
