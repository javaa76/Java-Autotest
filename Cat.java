public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        if (this.foodCounter > 0) {
            System.out.println("Кошка ест");
            this.foodCounter--;
            System.out.println(" Осталось запасов корма: " + this.foodCounter);
            if (this.foodCounter <= 0) System.out.println(" В следующий раз кошке есть будет нечего.\n" +
                    " Не забудьте пополнить запасы");
        }
        else {
            System.out.println("Кошка не может есть, пополните запасы корма!");
        }
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }

    Cat(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;
        this.health = health;
    }
}
