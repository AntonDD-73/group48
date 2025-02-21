package lesson7Home;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Черныш", 0.6, 10.0, "Черный", 4, "Рыба");
        Animal animal2 = new Animal("Черныш", 0.6, 10.0, "Черный", 4, "Рыба");
        Animal animal3 = new Animal("Брэйн", 0.1, 0.1, "Белый", 4, "Зерно");

        // животные говорят
        animal1.speak();
        System.out.println();
        animal2.speak();
        System.out.println();
        animal3.speak();
        System.out.println();

        // изменение параметров animal3
        animal3.setWeight(0.2);
        animal3.setFavoriteFood("Огурец");
        System.out.println("После изменения:");
        animal3.speak();
        System.out.println();

        // Сравнение животных
        System.out.println("Сравнение животных:");
        System.out.println("animal1 и animal2 равны? " + animal1.equals(animal2));
        System.out.println("animal1 и animal3 равны? " + animal1.equals(animal3));
        System.out.println("animal2 и animal3 равны? " + animal2.equals(animal3));
    }
}

