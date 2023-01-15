package task19part2.ru.pflb.vehicles;

import task19part2.ru.pflb.details.Engine;
import task19part2.ru.pflb.professions.Driver;

public class Lorry extends Car {
    protected int loadingAmount;
    public Lorry(String model, boolean isLarge, int weight, int loadingAmount, Driver driver, Engine engine) {
        super(model, weight, driver, engine);
        this.model = model;
        if (isLarge) this.vehicleClass = VehicleClass.LARGE;
        else this.vehicleClass = VehicleClass.MEDIUM;
        this.weight = weight;
        this.loadingAmount = loadingAmount;
        this.driver = driver;
        this.engine = engine;
    }

    public String toString() {
        String output = super.toString() + "\nДополнительная характеристика:" +
                "\n\tГрузоподъемность: " + this.loadingAmount;
        return output;
    }
}
