package task39part3;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 способ - напрямую из родителя: ");
        Animal.testStaticMethod();

        System.out.println("2 способ - через наследника: ");
        Cat.testStaticMethod();

        System.out.println("3 способ - через объект: ");
        Cat cat = new Cat();
        cat.testStaticMethod();
    }
}
