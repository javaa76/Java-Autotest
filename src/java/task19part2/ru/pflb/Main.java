package task19part2.ru.pflb;

import task19part2.ru.pflb.details.Engine;
import task19part2.ru.pflb.professions.Driver;
import task19part2.ru.pflb.vehicles.Car;
import task19part2.ru.pflb.vehicles.Lorry;
import task19part2.ru.pflb.vehicles.SportCar;
import task19part2.ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("Камаз",true, 1000, 500,
                new Driver("Ivanov", 35, 12, 99988800),
                new Engine(630, "ZMZ"));
        System.out.println(lorry);
        System.out.println("=====================================");
        SportCar sportCar = new SportCar("Lamborgini",550, 380,
                new Driver("Ken Block", 45, 25, 99008811),
                new Engine(1000, "Lamb"));
        System.out.println(sportCar);
        System.out.println("=====================================");
        Car car = new Car("Vezdehod", VehicleClass.MINI, 333,
                new Driver("Llolik", 23, 3, 77886611),
                new Engine(999, "Goog"));
        System.out.println(car);
    }
}
