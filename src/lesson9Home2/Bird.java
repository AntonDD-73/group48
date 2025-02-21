package lesson9Home2;

class Bird extends Animal {
    public Bird(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void move() {
        System.out.println("Птица летает по небу");
    }

    @Override
    public void eat() {
        System.out.println("Птица кушает семена");
    }

    public void sing() {
        System.out.println("Птица поёт");
    }
}
