package lesson9Home;

import java.util.Scanner;

public class CheapSquareController {

    public void start() {
        System.out.println("\nДобро пожаловать в Калькулятор рачсета!");
        System.out.println("Выберите фигуру для расчета площади:");
        while(true) {
            printMenu();
            printResult();
        }
    }

    private void printResult() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice){
            case 1:
                System.out.println("Укажите радиус круга: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                System.out.println(shape);
                break;
            case 2:
                System.out.println("Укажите ширину прямоугольника: ");
                double width = scanner.nextDouble();
                System.out.println("Укажите высоту прямоугольника: ");
                double length = scanner.nextDouble();
                shape = new Rectangle(width, length);
                System.out.println(shape);
                break;
            case 3:
                System.out.println("Укажите основание треугольника: ");
                double base = scanner.nextDouble();
                System.out.println("Укажите высоту треугольника: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                System.out.println(shape);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Неверный выбор.");
        }
    }

    private void printMenu() {
        System.out.println("\n1 - Круг");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Треугольник");
        System.out.println("0 - Выход");
    }
}

