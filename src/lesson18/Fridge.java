package lesson18;

import java.util.*;

public class Fridge {
    private Map<String, Integer> products = new HashMap<>();

    /**
     * Положить продукт в холодильник
     * @param product название продукта
     * @param weight вес продукта
     */
    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProductsFromZToA() {
        //По умолчанию отсортированы от а до я, поэтому устанавливаем компаратор reverseOrder(), который развернет порядок наборот
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());

        for (String productName : productNames) {
            System.out.println(productName + " - " + products.get(productName));
        }
    }
}
