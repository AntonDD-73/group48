package lesson13Home;

public class RubberDuck extends Duck implements Swimmable{
    public RubberDuck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю в ванной");
    }

    @Override
    public void quack() {
        System.out.println("Не умеет крякать");

    }

    @Override
    public void fly() {
        System.out.println("Не умеет летать");
    }

    @Override
    public void reproduce() {
        System.out.println("Не может размножаться");
    }
}
