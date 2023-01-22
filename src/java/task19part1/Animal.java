package task19part1;

public abstract class Animal {
    protected String name;
    protected String food;
    protected int foodCounter;
    protected String location;
    protected HealthState health;

    Animal(String name, String food, int foodCounter, String location, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.health = health;
    }

    /////////////////////////////////////Methods///////////////////////////////////////////////////////////////
    public abstract void makeSound();
    public void eat(String typeAnimal) {
        if (typeAnimal.equals("")) typeAnimal = "Существо";
        if (this.foodCounter > 0) {
            System.out.println(typeAnimal + " ест");
            this.foodCounter--;
            System.out.println(" Осталось запасов корма: " + this.foodCounter);
            if (this.foodCounter <= 0) System.out.println(" В следующий раз животному " +
                    typeAnimal + " есть будет нечего.\n" +
                    " Не забудьте пополнить запасы");
        }
        else {
            System.out.println(typeAnimal + " не может есть, пополните запасы корма!");
        }
    };

    public abstract void eat();

    public abstract void sleep();

    public void sleep(String typeAnimal) {
        if (typeAnimal.equals("") || typeAnimal.equals(null))
            typeAnimal = "Существо";
        System.out.println(typeAnimal + " спит");
    }
    public String toString() {
            String output = "=====================================================\n" +
                    this.name + "\n Страна обитания: " + this.location
                    + "\n Состояние здоровья: " + this.health + "\n Сколько особей: "
                    /*+ this.counter*/;
            return output;
    }

}
