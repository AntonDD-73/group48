package lesson3;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("1. Вывести на консоль все числа от 10 до 50, кроме чисел с 34 до 45");
        for (int numer = 10; numer < 50; numer++) {
            if (numer >= 34 && numer <= 45) {
                continue;
            }
            System.out.println(numer);
        }

        //Задача 2
        System.out.println("\nВывести все номера кабинета ВУЗа, при условии, что там 6 этажей и на каждом по 9 кабинетов.\n" +
                "Как только дойдём до 45 кабинета, перестать выводить кабинеты на этом этаже.");
        for (int floor = 1; floor <= 6; floor++) {
            for (int numberOfCabinet = 1; numberOfCabinet <= 9; numberOfCabinet++) {
                if (floor == 4 && numberOfCabinet == 5) {
                    break;
                    // return;
                }
                System.out.println("Кабинет №:" + floor + numberOfCabinet);
            }
        }
        //Задача 3
        System.out.println("\nСоздадим пустой массив на 11 элементов и узнать длину массива.");
        int[] intNumbers = new int[11];
        boolean[] booleanValues = new boolean[11];
        System.out.println(intNumbers);
        System.out.println("Длина массива: " + intNumbers.length);

        //Задача 4
        System.out.println("\nСоздадим массив чисел и выведим их значения по порядку, а затем в обратном порядке");
        double[] doubleNumbers = {1.1, 4.5, 3.54, 7.53, 2.65, 8.53};
        System.out.println("Вывод чисел по порядку расположения в массиве");
        for (int i = 0; i < doubleNumbers.length; i++) {
            double numbers = doubleNumbers[i];
            System.out.println(numbers);
        }
        System.out.println("Вывод числа по порядку обратному расположения в массиве");
        for (int i = doubleNumbers.length - 1; i >= 0; i--) {
            double numbers = doubleNumbers[i];
            System.out.println(numbers);
        }

        //Задача 5
        System.out.println("Вывести все чётные числа из массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < numbers.length; index++) {
            int number = numbers[index];
            if (numbers[index] % 2 == 0) {
                System.out.println(number);
            }

        }
    }
}
