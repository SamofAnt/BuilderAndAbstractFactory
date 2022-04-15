package org.itstep.msk.Patterns.factories;

import org.itstep.msk.Patterns.cars.city.CityCar;
import org.itstep.msk.Patterns.cars.sport.SportCar;

public interface CarFactory {
    CityCar createCityCar();
    SportCar createSportCar();
}
