package task19part2.ru.pflb.details;

public class Engine {
    protected int power;
    protected String vendor;

    public String toString() {
        String output = this.vendor + "-" + this.power;
        return output;
    }

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }

}
