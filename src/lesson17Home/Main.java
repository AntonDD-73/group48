package lesson17Home;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, 2.5, "Gold");
        Coin coin2 = new Coin(5, 1999, 2.5, "Gold");
        Coin coin3 = new Coin(10, 1990, 2.5, "Gold");
        Coin coin4 = new Coin(50, 1899, 5, "Olovo");
        Coin coin5 = new Coin(5, 1869, 10, "Silver");
        Coin coin6 = new Coin(5, 1869, 10, "Zmetall");

        System.out.println("Сортировка по году:\n");

        Set<Coin> coins = new TreeSet<>(new SortByYearComparator());
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins) {
            System.out.println(coin);
        }

        System.out.println("\nСортировка монет по диаметру(от большего к меньшему, году(от\n" +
                "меньшего к большему), металлу(по алфавиту от А до Я, от A до Z), по\n" +
                "номиналу(от меньшего к большему) в виде отдельного класса:\n");

        Set<Coin> coins1 = new TreeSet<>(new SortByDiameter());
        coins1.add(coin1);
        coins1.add(coin2);
        coins1.add(coin3);
        coins1.add(coin4);
        coins1.add(coin5);
        coins1.add(coin6);

        for (Coin coin : coins1) {
            System.out.println(coin);
        }

        System.out.println("\nСортировка монет по металлу(по алфавиту от Я до А, от Z до A), по\n" +
                "номиналу(от большего к меньшему), по диаметру(от меньшего к\n" +
                "большему) в виде анонимного класса-сравнителя:\n");

        Set<Coin> coins2 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (!o2.getMetalName().equals(o1.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }

                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }

                if (o1.getDiameter() > o2.getDiameter()) {
                    return o1.getDiameter() < o2.getDiameter() ? -1 : 1;
                }
                return o1.getYear() - o2.getYear();
            }
        });

        coins2.add(coin1);
        coins2.add(coin2);
        coins2.add(coin3);
        coins2.add(coin4);
        coins2.add(coin5);
        coins2.add(coin6);

        for (Coin coin : coins2) {
            System.out.println(coin);
        }
    }
}
