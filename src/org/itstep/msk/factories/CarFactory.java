package org.itstep.msk.factories;

import org.itstep.msk.cars.city.CityCar;
import org.itstep.msk.cars.sport.SportCar;

public interface CarFactory {
    CityCar createCityCar();
    SportCar createSportCar();
}
