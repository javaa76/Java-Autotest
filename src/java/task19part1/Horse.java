package task19part1;

public class Horse extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Лошадь гогочет");
    }

    @Override
    public void eat() {
        if (this.foodCounter > 0) {
            System.out.println("Лошадь ест");
            this.foodCounter--;
            System.out.println(" Осталось запасов корма: " + this.foodCounter);
            if (this.foodCounter <= 0) System.out.println(" В следующий раз лошади есть будет нечего.\n" +
                    " Не забудьте пополнить запасы");
        }
        else {
            System.out.println("Лошадь не может есть, пополните запасы корма!");
        }
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }

    Horse(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;
        this.health = health;
    }
}
