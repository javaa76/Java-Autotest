package task19part2.ru.pflb;

public abstract class Person {
    protected int age;
    protected String name;

    public String toString() {
        String output = "Данные водителе: " + "\n Имя - " + this.name +
                "\n Возраст - " + this.age;
        return output;
    }

}
