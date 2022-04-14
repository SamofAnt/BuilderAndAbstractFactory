package org.itstep.msk;

import org.itstep.msk.builders.Builder;
import org.itstep.msk.builders.CarBuilder;
import org.itstep.msk.cars.Car;
import org.itstep.msk.factories.CarFactory;
import org.itstep.msk.factories.FordFactory;

public class Main {

    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        CarFactory factory = new FordFactory();
        factory.createCityCar().build(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.print());

    }
}
