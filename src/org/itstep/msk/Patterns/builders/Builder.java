package org.itstep.msk.Patterns.builders;

import org.itstep.msk.Patterns.cars.Car;
import org.itstep.msk.Patterns.cars.CarType;

public interface Builder {

    Builder buildCarType(CarType type);

    Builder buildSeats(int seats);

    Builder buildModel(String model);

    Builder buildEngine(String engine);

    Builder buildDoors(int amountDoors);

    Car getResult();
}
