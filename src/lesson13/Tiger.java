package lesson13;

import lesson13.interfaces.Huntable;

public class Tiger extends Animal implements Huntable {
    public Tiger(String food, String color, int age, String name) {
        super(food, color, age, name);
    }

    @Override
    public void move() {
        System.out.println("Прыгаю за добычей");
    }

    @Override
    public void eat() {
        System.out.println("Ем мясо и людей");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю и мечтаю о еде");
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь за добычей, прячусь в засаде");
    }
}
