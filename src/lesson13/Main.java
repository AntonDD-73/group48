package lesson13;

import lesson13.interfaces.Flyable;
import lesson13.interfaces.Huntable;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Создадим животных
        // Орел
        // Слон
        // Жираф
        // Тигр
        // Лебедь
        // --- Есть ли у животных какие-то общие поля состояния? ---
        // Еда
        // Имя
        // Возраст
        // Цвет
        // --- Есть ли общее поведение? ---
        // двигаются
        // едят
        // спят
        //
        //Есть ли индивидуальное поведение?
        // Орел, Лебедь - летает
        // Тигр, Орел - охотится
        // Лебедь - плавает

        Eagle eagle = new Eagle("Падаль", "коричневый", 10, "Янки");
        Tiger tiger = new Tiger("Мясо", "полосатый", 15, "Шерхан");
        Swan swan = new Swan("Рыбу", "белый", 18, "Олег");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(eagle);
        animals.add(tiger);
        animals.add(swan);

        for (Animal animal : animals) {
            System.out.println("\n" + animal.getName());
            animal.eat();
            animal.move();
            animal.sleep();

            if (animal instanceof Flyable) {
                Flyable flyable = (Flyable) animal;
                flyable.fly();
            }

            if (animal instanceof Huntable) {
                Huntable huntable = (Huntable) animal;
                huntable.hunt();
            }
        }
    }
}
