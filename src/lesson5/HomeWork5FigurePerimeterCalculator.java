package lesson5;

import java.util.Scanner;

/**
 * Калькулятор периметров фигур
 */
public class HomeWork5FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметр треугольника");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - овал");
        System.out.println("5 - круг");

        //У сканера есть режимы работы
        //System.in - читает из консоли
        //System.out - пишет в консоль

        //У сканера есть несколько способов чтения из консоли
        //nextInt() - читает int числа из консоли
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            Homework5MathUtils.countPerimeterOfTriangle(a, b, c);

        } else if (userChoice == 2) {
            System.out.println("Введите длину стороны квадрата: ");
            double sideSquare = scanner.nextDouble();
            System.out.println("\nПериметер квадрата: " + Homework5MathUtils.countPerimeterOfSquare(sideSquare));

        } else if (userChoice == 3) {
            System.out.println("Введите сторону а: ");
            double a = scanner.nextDouble();

            System.out.println("Введите сторону b: ");
            double b = scanner.nextDouble();

            System.out.println("Введите сторону c: ");
            double c = scanner.nextDouble();

            System.out.println("Введите сторону d: ");
            double d = scanner.nextDouble();
            System.out.println("\nПериметер трапеции: " + Homework5MathUtils.countPerimeterOfTrapezoid(a, b, c, d));

        } else if (userChoice == 4) {
            System.out.println("Введите значение полуоси a: ");
            double a = scanner.nextDouble();

            System.out.println("Введите значение полуоси b: ");
            double b = scanner.nextDouble();
            System.out.println("\nПериметер овала: " + Homework5MathUtils.calculatePerimeterOval(a, b));

        } else if (userChoice == 5) {
            System.out.println("Введите радиус круга: ");
            double radius = scanner.nextDouble();
            System.out.println("\nПериметер круга: " + Homework5MathUtils.calculatePerimeterCircle(radius));
        }
        else {
            System.out.println("Что-то пошло не так. Выберите пенкт меню от 1 до 5");
        }


    }

    //Домашнее задание
    //Дописать решение для остальных фигур
    //В классе MathUtils - ТОЛЬКО МАТЕМАТИКА В МЕТОДАХ,
    // запрос данных от пользователя и вывод результата в консоль в FigurePerimeterCalculator


}
