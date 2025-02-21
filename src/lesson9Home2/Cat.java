package lesson9Home2;

class Cat extends Animal {
    public Cat(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void move() {
        System.out.println("Кошка красиво двигается");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }

    public void purr() {
        System.out.println("Кошка мурлычит");
    }
}
