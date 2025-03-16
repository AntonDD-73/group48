package lesson19Home.consumer;

import lesson19.consumer.PrintConsumer;
import lesson19Home.consumer.LengthPrintConsumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "", "Семечека");

        System.out.println("\nВыведем на консоль все не пустые слова через Consumer");
        PrintConsumer printConsumer = new PrintConsumer();
        for (String word : words) {
            printConsumer.accept(word);
        }

        System.out.println("\nВывод через функиональный интерфейс как отдельный класс LengthPrintConsumer:");
        words.forEach(new lesson19Home.consumer.LengthPrintConsumer());

        System.out.println("\nВывод через stream и method reference:");
        words.stream()
                .forEach(printConsumer::accept);

        System.out.println("\nАнонимный класс с выводом длины:");
        words.forEach(new Consumer<String>() {
            @Override
            public void accept(String word) {
                if (word != null && !word.isEmpty()) {
                    System.out.println(word + " (длина: " + word.length() + ")");
                }
            }
        });
    }
}