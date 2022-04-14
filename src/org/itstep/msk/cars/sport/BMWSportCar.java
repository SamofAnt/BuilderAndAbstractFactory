package org.itstep.msk.cars.sport;

import org.itstep.msk.builders.Builder;
import org.itstep.msk.cars.CarType;

public class BMWSportCar implements SportCar{
    @Override
    public void build(Builder builder) {
        builder.buildCarType(CarType.SPORTS_CAR)
                .buildSeats(2)
                .buildModel("BMW")
                .buildEngine("2.0L")
                .buildDoors(2);
    }
}
