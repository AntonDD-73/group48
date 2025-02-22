package lesson13Home;

public class LiveDuck extends Duck implements   Swimmable, Quackable, Flyable, Reproducible {

    public LiveDuck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю на озере");
    }

    @Override
    public void quack() {
        System.out.println("Крякаю когда захочу");
    }

    @Override
    public void fly() {
        System.out.println("Перелетаю с озера на озеро");
    }

    @Override
    public void reproduce() {
        System.out.println("Размножаюсь и появляются утята");
    }
}
