package lesson13Home;

public class Main {
    public static void main(String[] args) {
        LiveDucks liveDucks = new LiveDucks();
        PlushDucks plushDucks = new PlushDucks();
        RubberDucks rubberDucks = new RubberDucks();

        System.out.println("Живые утки:");
        liveDucks.swim();
        liveDucks.quack();
        liveDucks.fly();
        liveDucks.reproduce();

        System.out.println("\nПлюшевые утки:");
        plushDucks.swim();
        plushDucks.quack();
        plushDucks.fly();

        System.out.println("\nРезиновые утки:");
        rubberDucks.swim();
        rubberDucks.quack();
        rubberDucks.fly();
    }
}
