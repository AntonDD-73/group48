package lesson18Home;

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

    public void takeProduct(String productName, int weight) {
        if (!products.containsKey(productName)) {
            System.out.println("Продукт " + productName + " в холодильнике отсутствует.");
            return;
        }
        int currentWeight = products.get(productName);
        if (currentWeight < weight) {
            System.out.println("Недостаточно " + productName + ". В холодильнике всего: " + currentWeight + " гр.");
            return;
        }
        currentWeight -= weight;
        if (currentWeight == 0) {
            products.remove(productName);
            System.out.println(productName + " закончился. Надо сходить в магазин и купить.");
        }
    }

    public int getTotalWeight() {
        int totalWeight = products.values().stream().mapToInt(i -> i).sum();
        return totalWeight;
    }

    public int getProductWeight(String productName) {
        return products.getOrDefault(productName, 0);
    }

    public String getFirstExpiringProduct() {
        if (products.isEmpty()) {
            return "Холодильник пуст";
        }

        String resultProduct = null;
        int minWeight = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() < minWeight) {
                minWeight = entry.getValue();
                resultProduct = entry.getKey();
            }
        }
        return resultProduct;
    }
    public String getMostAbundantProduct() {
        if (products.isEmpty()) {
            return "Холодильник пуст";
        }

        String mostAbundant = null;
        int maxWeight = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() > maxWeight) {
                maxWeight = entry.getValue();
                mostAbundant = entry.getKey();
            }
        }
        return mostAbundant;
    }
    public void printProductsByWeightDesc() {
        List<Map.Entry<String, Integer>> productList = new ArrayList<>(products.entrySet());
        Collections.sort(productList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : productList) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " г.");
        }
    }
}
