package org.itstep.msk.factories;

import org.itstep.msk.cars.city.CityCar;
import org.itstep.msk.cars.city.FordCityCar;
import org.itstep.msk.cars.sport.FordSportCar;
import org.itstep.msk.cars.sport.SportCar;

public class FordFactory implements CarFactory{
    @Override
    public CityCar createCityCar() {
        return new FordCityCar();
    }

    @Override
    public SportCar createSportCar() {
        return new FordSportCar();
    }
}
