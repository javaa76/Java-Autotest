package task19part1;

public class Dog extends Animal {
    static int counter;
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        super.eat("Собака");
    }

    @Override
    public void sleep() {
        super.sleep("Собака");
    }

    Dog(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location, health);
        counter++;
    }

    @Override
    public String toString() {
        return super.toString() + counter;
    }
}
