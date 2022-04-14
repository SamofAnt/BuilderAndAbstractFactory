package org.itstep.msk.cars.city;

import org.itstep.msk.builders.Builder;
import org.itstep.msk.cars.CarType;


public class FordCityCar implements CityCar {
    @Override
    public void build(Builder builder) {
        builder.buildCarType(CarType.CITY_CAR)
                .buildSeats(4)
                .buildModel("Ford")
                .buildEngine("1.2L").
                buildDoors(4);
    }
}
