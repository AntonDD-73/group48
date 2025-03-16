package lesson20Home;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Ермак", 150000, 80));
        shops.add(new Shop("Магнит", 200000, 120));
        shops.add(new Shop("Карусель", 90000, 60));
        shops.add(new Shop("Ермак", 180000, 150));
        shops.add(new Shop("Магнит", 130000, 90));
        shops.add(new Shop("Карусель", 220000, 200));
        shops.add(new Shop("Ермак", 95000, 70));
        shops.add(new Shop("Магнит", 110000, 85));
        shops.add(new Shop("Карусель", 170000, 110));
        shops.add(new Shop("Ермак", 80000, 50));

        System.out.println("\nОбщий доход по всем магазинам.");
        double totalIncome = shops.stream().mapToDouble(Shop::getIncome).sum();
        System.out.println("Общий доход: " + totalIncome + " руб.");

        System.out.println("\nКоличество магазинов в сети Карусель");
        long karouselCount = shops.stream()
                .filter(shop -> "Карусель".equals(shop.getName()))
                .count();
        System.out.println("Количество магазинов Карусель: " + karouselCount);

        System.out.println("\nСредний доход на каждый магазин сети Магнит.");
        double magnitAverage = shops.stream()
                .filter(shop -> "Магнит".equals(shop.getName()))
                .mapToDouble(Shop::getIncome)
                .average()
                .orElse(0.0);
        System.out.printf("Средний доход магазинов сети Магнит: %.2f%n", magnitAverage);

        System.out.println("\nСортируем магазины сети Ермак по доходности от большего к меньшему");
        List<Shop> ermakShops = shops.stream()
                .filter(shop -> "Ермак".equals(shop.getName()))
                .sorted(new sortedByIncome())
                .collect(Collectors.toList());

        System.out.println("\nМагазины Ермак (отсортировано по доходности - убывание):");
        ermakShops.forEach(shop -> System.out.println("Название: " + shop.getName() + ", Доход: " + shop.getIncome()));

        System.out.println("\nСортируем магазины сети Магнит по соотношению дохода на 1м площади магазина");
        List<Shop> magnitShops = shops.stream()
                .filter(shop -> "Магнит".equals(shop.getName()))
                .sorted(new getIncomePerArea()) // Сортировка с использованием Comparator
                .collect(Collectors.toList());

        System.out.println("Магазины Магнит (сортировка по доходу на 1м²):");
        magnitShops.forEach(shop -> System.out.printf("Доход: %.0f, Площадь: %.0f м², Соотношение: %.2f руб/м²%n",
                shop.getIncome(),
                shop.getArea(),
                shop.getIncome() / shop.getArea()
        ));

        System.out.println("\nИщем топ 2 лучших и худших магазина по доходу, в процессе расчета выводим\n" +
                "каждый магазин в консоль");
        List<Shop> sortedShops = shops.stream()
                .sorted(Comparator.comparingDouble(Shop::getIncome).reversed()) // Сортировка по доходу по убыванию
                .collect(Collectors.toList());

        System.out.println("\nТоп 2 лучших магазина по доходу:");
        sortedShops.stream().limit(2).forEach(shop -> System.out.println(shop));

        System.out.println("\nТоп 2 худших магазина по доходу:");
        sortedShops.stream().skip(sortedShops.size() - 2).forEach(shop -> System.out.println(shop));

        System.out.println("\nВывод магазинов, в которых соотношение доход на 1м квадратный больше 1000 рублей");
        for (Shop shop : shops) {
            double incomePerSquareMeter = shop.getIncome() / shop.getArea();
            if (incomePerSquareMeter > 1000) {
                System.out.println(shop);
            }
        }
    }
}
