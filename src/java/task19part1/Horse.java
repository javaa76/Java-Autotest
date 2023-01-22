package task19part1;

public class Horse extends Animal {
    static int counter;
    @Override
    public void makeSound() {
        System.out.println("Лошадь гогочет");
    }


    @Override
    public void eat() {
        super.eat("Лошадь");
    }

    @Override
    public void sleep() {
        super.sleep("Лошадь");
    }

    Horse(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location, health);
        counter++;
    }
    @Override
    public String toString() {
        return super.toString() + counter;
    }
}
