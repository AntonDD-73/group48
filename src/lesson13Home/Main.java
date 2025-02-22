package lesson13Home;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LiveDuck liveDuck = new LiveDuck("Живая утка");
        PlushDuck plushDuck =new PlushDuck("Плюшевая утка");
        RubberDuck rubberDuck =new RubberDuck("Резиновая утка");

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(liveDuck);
        ducks.add(plushDuck);
        ducks.add(rubberDuck);

        for (Duck duck : ducks) {
            System.out.println("\n" + duck);

            if (duck instanceof Flyable) {
                Flyable flyable = (Flyable) duck;
                flyable.fly();
            }

            if (duck instanceof Quackable) {
                Quackable quackable = (Quackable) duck;
                quackable.quack();
            }

            if (duck instanceof Swimmable) {
                Swimmable swimmable = (Swimmable) duck;
                swimmable.swim();
            }

            if (duck instanceof Reproducible) {
                Reproducible reproducible = (Reproducible) duck;
                reproducible.reproduce();
            }
        }
    }
}
