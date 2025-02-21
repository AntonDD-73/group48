package lesson13;

import lesson13.Flyable;
import lesson13.Huntable;

public class Eagle extends Animal implements Flyable, Huntable {
    public Eagle(String food, String color, int age, String name) {
        super(food, color, age, name);
    }

    @Override
    public void move() {
        System.out.println("Летаю высоко в небе");
    }

    @Override
    public void eat() {
        System.out.println("Ем мертвых животных и крыс");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю в полете");
    }

    @Override
    public void fly() {
        System.out.println("Летает высоко в небе");
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь на падаль");
    }
}
