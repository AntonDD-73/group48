package lesson11;

import java.util.ArrayList;
import java.util.List;

public class HomeWork11 {
    public static void main(String[] args) {

        System.out.println("Задание 1: Определение типов данных \nДля каждого из приведенных ниже выражений определите," +
                        " к какому типу данных оно относится (примитивному или ссылочному):");
        int x = 10;
        System.out.println("int x = " + x + " - Примитивный тип");
        String str = "Hello";
        System.out.println("int x = " + x + " - Примитивный тип");
        boolean isTrue = true;
        System.out.println("boolean isTrue = " + isTrue + " - Примитивный тип");
        double d = 3.14; //
        System.out.println("double d = " + d + " - Примитивный тип");
        Integer i = new Integer(20);
        //Integer i = Integer.valueOf(20);
        //Integer i = 20;
        System.out.println("Integer i = " + i + " - Ссылочный тип");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("ArrayList<Integer> list = " + list + " - Ссылочный тип");
        char c = 'a';
        System.out.println("char c = '" + c + "' - Примитивный тип");
        float f = 2.718f;
        System.out.println("float f = " + f + " - Примитивный тип");

        System.out.println("\nЗадание 2: Преобразования типов. \nНапишите код, который выполняет следующие преобразования:");

        System.out.println("Целое число int в строку String.");
        int intNumber = 35;
        String stringNumber = String.valueOf(intNumber);
        System.out.println(stringNumber);

        System.out.println("\nCтроку String, содержащую числовое значение, в целочисленный тип int.");
        String stringNumber2 = "75";
        //int number2 = Integer.valueOf(stringNumber2);
        int intNumber2 = Integer.parseInt(stringNumber2);
        System.out.println(intNumber2);

        System.out.println("\nВещественное число double в целое число int с потерей дробной части.");
        double doubleNumber = 55.77;
        Double doubleNumber2 = doubleNumber;
        int intNumber3 = doubleNumber2.intValue();
        System.out.println(intNumber3);

        System.out.println("\nМассив целых чисел int[] в список ArrayList<Integer> с использованием автоупаковки.");
        int[] intArray = {1, 10, 15, 20, 99};
        List<Integer> integerList = new ArrayList<>();
        for (int numbers : intArray) {
            integerList.add(numbers);
        }
        System.out.println(integerList);

        System.out.println("\nЗадание 3: Работа с классами-обёртками.\nСоздайте программу, которая демонстрирует работу " +
                "с классами-обёртками. Программа должна выполнять следующее:");
        System.out.println("\nСоздать объект класса Integer с помощью конструктора.");
        Integer integerNumber = new Integer(100);
        System.out.println("Объект Integer, созданный с помощью конструктора: " + integerNumber);
        System.out.println("\nСоздать объект класса Integer методом valueOf().");
        Integer integerNumber2 = Integer.valueOf(200);
        System.out.println("Объект Integer, созданный с помощью valueOf(): " + integerNumber2);

        System.out.println("\nИспользовать метод equals() для сравнения двух объектов Integer.");
        boolean numberEqual = integerNumber.equals(integerNumber2);
        System.out.println("Сравнение объектов с помощью equals(): " + numberEqual);

        System.out.println("\nПрименить метод parseInt() для преобразования строки в целое число.");
        String numberStr = "19";
        int number7 = Integer.parseInt(numberStr);
        System.out.println("Преобразованное число из строки: " + number7);
    }
}
