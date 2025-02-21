package lesson13;

public class Elephant extends Animal {
    public Elephant(String food, String color, int age, String name) {
        super(food, color, age, name);
    }

    @Override
    public void move() {
        System.out.println("Хожу и громко топаю ногами");
    }

    @Override
    public void eat() {
        System.out.println("Ем листья и бананы");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю стою");
    }
}
