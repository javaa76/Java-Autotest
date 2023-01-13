public class Vet {
    private String name;

    void treatAnimal(Animal animal) {
        System.out.println("Прием ведет ветеренарный врач " + this.name);
        if (animal.health == HealthState.UNHEALTHY) {
            System.out.println(" Животное больно! \n  Врач лечит...");
            int s = 0;                // Типо задержка
            while (s < 10000000) s++;
            System.out.println(" Животное вылечено!");
            animal.health = HealthState.HEALTHY;
        }
        else System.out.println(" Осмотр произведен. Лечение не требуется.");
    }

    Vet(String name) {
        this.name = name;
    }
}
