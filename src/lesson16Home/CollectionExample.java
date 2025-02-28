package lesson16Home;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        System.out.println("Объединение двух коллекций с дубликатами");

        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(9);

        System.out.println(utils.union(arrayList, linkedList));

        System.out.println("\nПересечение двух коллекций с дубликатами");
        System.out.println(utils.intersection(arrayList, linkedList));

        System.out.println("\nРазность двух коллекций");
        System.out.println(utils.difference(arrayList, linkedList));

        System.out.println("\nОбъединение двух коллекций без дубликатов");
        System.out.println(utils.unionWithoutDuplicate(arrayList, linkedList));

        System.out.println("\nПересечение двух коллекций без дубликатов");
        System.out.println(utils.intersectionWithoutDuplicate(arrayList, linkedList));
    }
}
