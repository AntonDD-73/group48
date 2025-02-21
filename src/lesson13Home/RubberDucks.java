package lesson13Home;

public class RubberDucks extends Ducks{
    @Override
    public void quack() {
        System.out.println("Резиновые утки не кряхтят");
    }

    @Override
    public void fly() {
        System.out.println("Резиновые утки не умеют летать");
    }
}
