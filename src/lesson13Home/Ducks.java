package lesson13Home;

public abstract class Ducks implements Swimmable, Quackable, Flyable {
    @Override
    public void swim() {
        System.out.println("Утки плавают.");
    }

    @Override
    public void quack() {
        System.out.println("Утки крякают.");
    }

    @Override
    public void fly() {
        System.out.println("Утки летают.");
    }
}