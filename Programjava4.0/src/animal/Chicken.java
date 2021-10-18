package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cục cục cục....shipppp!!!";
    }

    public String howtoEat() {
        return "could be fried";
    }
}
