package task19part2.ru.pflb.vehicles;

import task19part2.ru.pflb.details.Engine;
import task19part2.ru.pflb.professions.Driver;

public class SportCar extends Car{
    protected int maxVelocity;
    public SportCar(String model, int weight, int maxVelocity, Driver driver, Engine engine) {
        super(model, VehicleClass.SPORTS_CAR, weight, driver, engine);;
        this.maxVelocity = maxVelocity;
    }

    public String toString() {
        String output = super.toString() + "\nДополнительная характеристика:" +
                "\n\tМаксимальная скорость: " + this.maxVelocity;
        return output;
    }
}
