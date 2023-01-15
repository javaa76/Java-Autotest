package task19part2.ru.pflb.vehicles;

import task19part2.ru.pflb.details.Engine;
import task19part2.ru.pflb.professions.Driver;

public class SportCar extends Car{
    protected int maxVelocity;
    public SportCar(String model, int weight, int maxVelocity, Driver driver, Engine engine) {
        super(model, weight, driver, engine);
        this.model = model;
        this.weight = weight;
        this.maxVelocity = maxVelocity;
        this.driver = driver;
        this.engine = engine;
        this.vehicleClass = VehicleClass.SPORTS_CAR;
    }

    public String toString() {
        String output = super.toString() + "\nДополнительная характеристика:" +
                "\n\tМаксимальная скорость: " + this.maxVelocity;
        return output;
    }
}
