package task19part2.ru.pflb;

public abstract class Person {
    protected int age;
    protected String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        String output = "Имя - " + this.name +
                "\n Возраст - " + this.age;
        return output;
    }

}
