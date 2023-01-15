package task19part2.ru.pflb.vehicles;

import task19part2.ru.pflb.details.Engine;
import task19part2.ru.pflb.professions.Driver;

public class Car {
    protected String model;
    protected VehicleClass vehicleClass;
    protected int weight;
    protected Driver driver;
    protected Engine engine;

    public void start() {
        System.out.println("Поехали");
    }
    public void stop() {
        System.out.println("Останавливаемся");
    }
    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        String output = "Модель: "+ this.model + ", класс: " + this.vehicleClass +
                "\nХарактеристики:" + "\n\tвес:" + this.weight +
                "\n\tдвигатель: " + engine.toString() +
                "\n Водитель: " + driver.toString();
        return output;
    }

    public Car(String model, VehicleClass vehicleClass, int weight,
               Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public Car(String model, int weight,
               Driver driver, Engine engine) {
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
}
