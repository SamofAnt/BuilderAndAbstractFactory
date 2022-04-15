package org.itstep.msk.Patterns.factories;

import org.itstep.msk.Patterns.cars.city.BMWCityCar;
import org.itstep.msk.Patterns.cars.city.CityCar;
import org.itstep.msk.Patterns.cars.sport.BMWSportCar;
import org.itstep.msk.Patterns.cars.sport.SportCar;

public class BMWFactory implements CarFactory{
    @Override
    public CityCar createCityCar() {
        return new BMWCityCar();
    }

    @Override
    public SportCar createSportCar() {
        return new BMWSportCar();
    }
}
