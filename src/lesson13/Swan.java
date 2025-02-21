package lesson13;

import lesson13.interfaces.Flyable;
import lesson13.interfaces.Swimming;

public class Swan extends Animal implements Flyable, Swimming {
    public Swan(String food, String color, int age, String name) {
        super(food, color, age, name);
    }

    @Override
    public void move() {
        System.out.println("Плаваю в воде и ищу рыбу");
    }

    @Override
    public void eat() {
        System.out.println("Ем рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю на воде");
    }

    @Override
    public void fly() {
        System.out.println("Летае на зимовку на юг");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю с помощью лап-ласт");
    }
}
