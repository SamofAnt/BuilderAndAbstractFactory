package org.itstep.msk.builders;

import org.itstep.msk.cars.Car;
import org.itstep.msk.cars.CarType;

public interface Builder {

    Builder buildCarType(CarType type);

    Builder buildSeats(int seats);

     Builder buildModel(String model);

     Builder buildEngine(String engine);

     Builder buildDoors(int amountDoors);

      Car getResult();
}
