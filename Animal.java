/*
Класс Animal - абстрактный.
Содержит параметры:
- name - кличка животного
- food - название типа пищи
- foodCounter - кол-во запасов пищи
- location - название страны обитания
- counter - все животные имеют внутреннюю связь с сородичами,
                 в переменной содержится общее кол-во осыбей данного вида
- health - состояние здоровья животного типа HealthState
Возможные значения HealthState
  HEALTHY,
  UNHEALTHY

Класс Animal содержит методы:
- makeSound - выводит текст, как звучит животное
- eat - выводит текст, что животное ест;
          уменьшает кол-во еды у животного;
          также выводит сколько запасов осталось
- sleep - выводит текст, что животное спит
- toString - вовзращает в виде строки текущую информацию об особи
Формат вывода:
<Кличка>
  Страна обитания: ...
  Состояние здоровья: ...
  Сколько особей: ...
*/
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

    ////////////////////////////////Setter and Getters///////////////////////////////////////////////
    // Name getter setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Food getter setter
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    // foodcounter getter setter
    public int getFoodCounter() {
        return foodCounter;
    }
    public void setFoodCounter(int foodCounter) {
        if (foodCounter > 0) this.foodCounter = foodCounter;
    }
    // Location getter setter
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    // counter getter setter
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        if (counter > 0) this.counter = counter;
    }
    // HealthState getter setter
    public HealthState getHealthState() {
        return health;
    }
    public void setHealthState(HealthState health) {
        this.health = health;
    }
    /////////////////////////////////////Methods///////////////////////////////////////////////////////////////
    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
    public abstract String toString();
    /*
        - toString - вовзращает в виде строки текущую информацию об особи
            Формат вывода:
            <Кличка>
            Страна обитания: ...
            Состояние здоровья: ...
            Сколько особей: ...
     */

}
