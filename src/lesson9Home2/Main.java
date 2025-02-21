package lesson9Home2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat(3, 4.5);
        animals[1] = new Dog(5, 20.0);
        animals[2] = new Bird(1, 0.5);

        for (Animal animal : animals) {
            animal.move();
        }
    }
}   // не стал мудрить с выбором пользователя и ввода значений животных, не хватило времени так как нехватка времени
// из за встречи выпускников ((
