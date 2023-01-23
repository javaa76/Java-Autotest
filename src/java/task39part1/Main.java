package task39part1;

import task39part1.cat.Cat;

public class Main {
    public static void main(String[] args) {

    Cat cat = new Cat();
    Cat catWithAge = new Cat(10);
    Cat catWithAll = new Cat(10, "Black", 5, "Brown");
    Cat catWithAgeWeight = new Cat(3, 6);
    Cat catWithThree = new Cat(0, "Green", 1);
    Cat catWithEyesColor = new Cat("Red");
    Cat catWithWeigthFurColor = new Cat("White", 10);
    Cat catWithAgeEyesColor = new Cat(10, "Green");
    Cat catWithEyesColorWeightFurColor = new Cat("Red", 10, "Black");
    Cat catWithEyesColorFurColor = new Cat("Brown", "Grey");

        System.out.println(cat);
        System.out.println(catWithAge);
        System.out.println(catWithAll);
        System.out.println(catWithAgeWeight);
        System.out.println(catWithThree);
        System.out.println(catWithAgeEyesColor);
        System.out.println(catWithEyesColor);
        System.out.println(catWithEyesColorWeightFurColor);
        System.out.println(catWithWeigthFurColor);
        System.out.println(catWithEyesColorFurColor);
    }
}
