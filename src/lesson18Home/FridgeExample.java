package lesson18Home;

public class FridgeExample {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Банан", 200);
        fridge.addProduct("Масло", 500);
        fridge.addProduct("Банан", 400);
        fridge.addProduct("Йогурт", 150);
        fridge.addProduct("Колбаса", 1000);

        System.out.println("\nВыведем все продукты и веса от Я до А");
        fridge.printAllProductsFromZToA();

        System.out.println("Взяли 1000 гр Колбасы:");
        fridge.takeProduct("Колбаса", 900);
        System.out.println("\nОсталось колбасы: " + fridge.getProductWeight("Колбаса") + " гр.\n");

        System.out.println("Общий вес всех продуктов в холодильнике: " + fridge.getTotalWeight() + " гр.\n");

        System.out.println("Продукт, который закончится первым: " + fridge.getFirstExpiringProduct() + "\n");

        System.out.println("Продукт, которого больше всего: " + fridge.getMostAbundantProduct() + "\n");

        System.out.println("5. Все продукты по весу (убывание):");
        fridge.printProductsByWeightDesc();
    }
}
