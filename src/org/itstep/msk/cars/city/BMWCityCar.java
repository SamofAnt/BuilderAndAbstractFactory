package org.itstep.msk.cars.city;

import org.itstep.msk.builders.Builder;
import org.itstep.msk.cars.CarType;

public class BMWCityCar implements CityCar {
    @Override
    public void build(Builder builder) {
        builder.buildCarType(CarType.CITY_CAR)
                .buildSeats(5)
                .buildModel("BMW")
                .buildEngine("1.8L")
                .buildDoors(4);
    }
}
