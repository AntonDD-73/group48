package lesson19Home.supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "Семечека");

        System.out.println("\nВывод через отдельный класс:");
        Supplier<String> wordSupplier1 = new RandomWordSupplier(words);
        System.out.println("Случайное слово из класса: " + wordSupplier1.get());

        System.out.println("\nВывод через анонимный класс:");
        Supplier<String> wordSupplier2 = new Supplier<String>() {
            private final Random random = new Random();
            private final List<String> wordsList = words;

            @Override
            public String get() {
                return wordsList.get(random.nextInt(wordsList.size()));
            }
        };

        System.out.println("Случайное слово из анонимного класса: " + wordSupplier2.get());
    }
}

