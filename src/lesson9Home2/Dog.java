package lesson9Home2;

class Dog extends Animal {
    public Dog(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void move() {
        System.out.println("Собака быстро бегает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест мясо");
    }

    public void bark() {
        System.out.println("Собака лает");
    }
}
