package org.itstep.msk.factories;

import org.itstep.msk.cars.city.BMWCityCar;
import org.itstep.msk.cars.city.CityCar;
import org.itstep.msk.cars.sport.BMWSportCar;
import org.itstep.msk.cars.sport.SportCar;

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
