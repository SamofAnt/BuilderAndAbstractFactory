package org.itstep.msk.cars;

public class Car {
    private final CarType carType;
    private final int seats;
    private String model;
    private final String engine;
    private int amountDoors;

    public Car(CarType carType, int seats, String model,String engine, int amountDoors) {
        this.carType = carType;
        this.seats = seats;
        this.model = model;
        this.engine = engine;
        this.amountDoors = amountDoors;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public String getModel(){return model;}

    public String getEngine() {
        return engine;
    }

    public int getAmountDoor(){return amountDoors;}

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Model: " + model + "\n";
        info += "Engine: " + engine + "\n";
        info += "Amount of doors: "  + amountDoors + "\n";
        return info;
    }
}
