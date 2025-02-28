package lesson16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем новый список:");
        Set<Integer> numbers = new TreeSet<>();

        System.out.println("\nadd(E element): Добавляет элемент в множество, если он отсутствует.");
        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(99);
        numbers.add(2);

        System.out.println("\nsize(): Возвращает количество элементов в множестве.");
        System.out.println("Размер коллекции - " + numbers.size());

        System.out.println("\nisEmpty(): Проверяет, пусто ли множество.");
        System.out.println("Коллекция пустая? - " + numbers.isEmpty());

        System.out.println("\nremove(Object o): Удаляет элемент из множества, если элемент присутствует.\n");
        numbers.remove(1);

        System.out.println("\ncontains(Object o): Проверяет, содержится ли элемент в множестве.");
        System.out.println("Проверка, есть ли элемент 99 - " + numbers.contains(99));
        System.out.println("Проверка, есть ли элемент 0 - " + numbers.contains(0));

        System.out.println("\nВывод всех элементов до очистки");
        System.out.println(numbers);

//        for (Integer number : numbers) {
//            if (number == 2) {
//                numbers.remove(number);
//            }
//        }

//        numbers.removeIf(number -> number == 2);
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            int number = iterator.next();
//            if (number == 2) {
//                iterator.remove();
//            }
//        }

        System.out.println("\nclear(): Очищает список, удаляя все его элементы.");
        numbers.clear();

        System.out.println("\nВывод всех элементов после очистки");
        System.out.println(numbers);
    }
}
