package lesson13Home;

public class PlushDuck extends Duck implements Swimmable, Quackable {

    public PlushDuck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю в бассейне");

    }

    @Override
    public void quack() {
        System.out.println("Крякаю когда на меня нажимают");
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
