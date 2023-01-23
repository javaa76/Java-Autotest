package task39part4;

public class Main {
    public static void main(String[] args) {
        System.out.println(Animal.planet);
        Cat cat = new Cat();
        cat.planet = "Луна";
        System.out.println(cat.planet);
    }
}
