package lesson19Home.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "Семечека");

        System.out.println("\nВывод через отдельный класс:");
        Predicate<String> lengthPredicate = new LengthPredicate(5);
        List<String> longWords = words.stream()
                .filter(lengthPredicate)
                .collect(Collectors.toList());
        System.out.println("Слова длиннее 5 символов: " + longWords);

        System.out.println("\nВывод через анонимный класс:");

        Predicate<String> startsWithTPredicate = new Predicate<>() {
            @Override
            public boolean test(String word) {
                return word.startsWith("Т");
            }
        };

        List<String> tWords = words.stream()
                .filter(startsWithTPredicate)
                .collect(Collectors.toList());
        System.out.println("Слова на букву 'Т': " + tWords);
    }
}
