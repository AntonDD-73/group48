package lesson9Home2;

class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void move() {
        System.out.println("Животные двигаются");
    }

    public void eat() {
        System.out.println("Животные едят");
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}