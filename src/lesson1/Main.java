package lesson1;

public class Main {
    public static void main(String[] args) {
        // Есть 3 стороны треугольника, напечатать на консоль его периметр
        System.out.println("Задача 1");
        System.out.println("Есть 3 стороны треугольника, напечатать на консоль его периметр");

        //Дано
        int a = 129;
        int b = 4;
        int c = 9;

        //Решение
        int perimeter = a + b + c;

        //Вывод в консоль
        System.out.println("Периметр треугольника " + perimeter);
        System.out.println();
        System.out.println("Задача 2");
        System.out.println("Есть ширина и длина стола, есть ширина и длина комнаты. Вывести на консоль, сколько таких " +
                "столов влезет в комнату?");

        //Дано
        double tableLength = 142.5;
        double tableWidth = 100.1;
        double roomLength = 1565.5;
        double roomWidth = 1000.5;

        //Решение
        double tableArea = tableLength * tableWidth;
        double roomArea = roomLength * roomWidth;

        int quantityOfTables = (int) (roomArea / tableArea);
        System.out.println("Ответ: " + quantityOfTables);
        System.out.println();
        System.out.println("Задача 3");
        System.out.println("У нас есть 1000 рублей. Мы идем в магазин. Нам\n" +
                "нужно купить по максимуму сникерсов, и на сдачу\n" +
                "купить конфет. Сникерс стоит 35 руб. Конфета -\n" +
                "3,5 руб.");
        //Дано
        int money = 1000;
        int coastSnickers = 35;
        double coastCandy = 3.5;

        //Решение
        int quantitySnickers = money / coastSnickers;
        int changeSnickers = money - (quantitySnickers * coastSnickers);
        int quantityCandy = (int) (changeSnickers / coastCandy);
        double changeCandy = money - ((quantitySnickers * coastSnickers)+(quantityCandy * coastCandy));
        System.out.println("Ответ:");
        System.out.println("Сникерс: " + quantitySnickers );
        System.out.println("Конфет: " + quantityCandy );
        System.out.println("Сдача: " + changeCandy );
            }
}