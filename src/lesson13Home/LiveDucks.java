package lesson13Home;

public class LiveDucks extends Ducks implements Reproducable {
    @Override
    public void reproduce() {
        System.out.println("Живые утки могут размножатся.");
    }
}
