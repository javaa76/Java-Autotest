package task19part1;

enum HealthState {
    HEALTHY,
    UNHEALTHY
}
public abstract class Animal {
    protected String name;
    protected String food;
    protected int foodCounter;
    protected String location;
    protected int counter;
    protected HealthState health;

    /////////////////////////////////////Methods///////////////////////////////////////////////////////////////
    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
    public String toString() {
            String output = "=====================================================\n" +
                    this.name + "\n Страна обитания: " + this.location
                    + "\n Состояние здоровья: " + this.health + "\n Сколько особей: "
                    + this.counter;
            return output;
    }

}
