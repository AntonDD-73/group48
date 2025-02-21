package lesson13;

public class Giraffe extends Animal {
    public Giraffe(String food, String color, int age, String name) {
        super(food, color, age, name);
    }

    @Override
    public void move() {
        System.out.println("Хожу и цепляю все длинной шеей");
    }

    @Override
    public void eat() {
        System.out.println("Ем листья с деревьев");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю склонив голову");
    }
}
