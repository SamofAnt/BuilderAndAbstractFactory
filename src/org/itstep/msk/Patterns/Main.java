package org.itstep.msk.Patterns;

import org.itstep.msk.Patterns.builders.Builder;
import org.itstep.msk.Patterns.builders.CarBuilder;
import org.itstep.msk.Patterns.cars.Car;
import org.itstep.msk.Patterns.factories.CarFactory;
import org.itstep.msk.Patterns.factories.FordFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        CarFactory factory = new FordFactory();
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            factory.createCityCar().build(builder);
            cars.add(builder.getResult());
        }
        cars.forEach(car->System.out.println("Car built:\n" + car.print()));

    }
}
