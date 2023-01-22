package task19part1;

public class Cat extends Animal {
    static int counter;
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        super.eat("Кошка");
    }

    @Override
    public void sleep() {
        super.sleep("Кошка");
    }

    Cat(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location, health);
        counter++;
    }


    @Override
    public String toString() {
        return super.toString() + counter;
    }
}
