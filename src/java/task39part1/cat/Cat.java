package task39part1.cat;

public class Cat {
    int age = -1; // Для того чтобы можно было выводить 0 лет, если задано
    String eyesColor;
    int weigth;
    String furColor;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public Cat(int age, String eyesColor) {
        this.age = age;
        this.eyesColor = eyesColor;
    }

    public Cat(int age, String eyesColor, int weigth) {
        this.age = age;
        this.eyesColor = eyesColor;
        this.weigth = weigth;
    }

    public Cat(String eyesColor, int weigth, String furColor) {
        this.eyesColor = eyesColor;
        this.weigth = weigth;
        this.furColor = furColor;
    }

    public Cat(int age, int weigth) {
        this.age = age;
        this.weigth = weigth;
    }

    public Cat(String eyesColor, String furColor) {
        this.eyesColor = eyesColor;
        this.furColor = furColor;
    }

    public Cat(int age, String eyesColor, int weigth, String furColor) {
        this.age = age;
        this.eyesColor = eyesColor;
        this.weigth = weigth;
        this.furColor = furColor;
    }

    public Cat(String furColor, int weigth) {
        this.furColor = furColor;
        this.weigth = weigth;
    }

    public String toString() {
       String str = "==============================================================";
       str = str + "\nСоздан котик";
       if (this.age >= 0) str = str + "\n Возраст котика: " + this.age;
       if (this.eyesColor != null) str = str + "\n Цвет глаз: " + this.eyesColor;
       if (this.weigth > 0) str = str + "\n Вес: "  + this.weigth + " кг";
       if (this.furColor != null) str = str + "\n Цвет шерсти: " + this.furColor;
       return str;
    }
}
