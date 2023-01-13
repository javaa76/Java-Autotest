package task19part1;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        if (this.foodCounter > 0) {
            System.out.println("Собака ест");
            this.foodCounter--;
            System.out.println(" Осталось запасов корма: " + this.foodCounter);
            if (this.foodCounter <= 0) System.out.println(" В следующий раз собаке есть будет нечего.\n" +
                    " Не забудьте пополнить запасы");
        }
        else {
            System.out.println("Собака не может есть, пополните запасы корма!");
        }

    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }

    Dog(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;
        this.health = health;
    }
}
