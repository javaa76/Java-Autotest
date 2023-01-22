package task19part1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Трезор", "Пурина", 1,
                "США", HealthState.UNHEALTHY);
        Cat cat = new Cat("Маркиза", "RoyalCanin", 25,
                "Россия", HealthState.UNHEALTHY);
        Horse horse = new Horse("Сердар", "Osolio", 100,
        "Иран", HealthState.HEALTHY);


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(horse);
        System.out.println("=====================================================");
        dog.makeSound();
        cat.makeSound();
        horse.makeSound();
        System.out.println("=====================================================");
        dog.eat();
        horse.eat();
        System.out.println("=====================================================");
        Vet vet = new Vet("Иванов В.В");
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);
        System.out.println("=====================================================");
        cat.sleep();
    }

}
