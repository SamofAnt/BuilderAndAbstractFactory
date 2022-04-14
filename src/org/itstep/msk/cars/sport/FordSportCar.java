package org.itstep.msk.cars.sport;

import org.itstep.msk.builders.Builder;
import org.itstep.msk.cars.CarType;

public class FordSportCar implements SportCar{
    @Override
    public void build(Builder builder) {
        builder.buildCarType(CarType.SPORTS_CAR)
                .buildSeats(4)
                .buildModel("Ford")
                .buildEngine("2.8L")
                .buildDoors(4);
    }
}
