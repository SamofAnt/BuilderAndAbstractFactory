package org.itstep.msk.Patterns.factories;

import org.itstep.msk.Patterns.cars.city.CityCar;
import org.itstep.msk.Patterns.cars.city.FordCityCar;
import org.itstep.msk.Patterns.cars.sport.FordSportCar;
import org.itstep.msk.Patterns.cars.sport.SportCar;

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
