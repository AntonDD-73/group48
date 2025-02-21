package lesson5;


/**
 * Создание метода
 * 1 - модификатор доступа (слово определяющее область видимости метода)
 * public - доступен внутри всего проекта
 * protected - доступен только внутри текущей папки и наследникам текущего класса
 * package - дефолтный, если ничего не ставить, будет он по умолчанию, доступ только внутри текущей папки
 * private - доступен только внутри текущего класса
 *
 * Где можно ставить модификатор доступа:
 * - перед классом
 * - перед методом
 * - перед полем класса (состояние)
 *
 * опционально
 * может быть или не быть
 * 2 static - делает метод статическим
 *
 * 3 Метод может возвращать значение или нет
 * указываем тип возвращаемого значения (int, String, etc..)
 * или ничего не возвращает, тогда указываем void
 *
 * 4 название метода
 *
 *  опционально
 *  может быть или не быть
 * 5 входящие параметры (Всегда в () через , и с указанием типа и названия (String text, int number)
 *
 * 6 тело выполнения данного метода (его логика)
 *
 *
 *
 */
public class Homework5MathUtils {

    //Задача - создать метод, который посчитает периметр треугольника по 3м сторонам и выведет ее в консоль

    /**
     * Метод расчета площади треугольника
     * @param a сторона а
     * @param b сторона b
     * @param c сторона c
     */
    public static void countPerimeterOfTriangle(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println(perimeter);
    }

    //Задача - создать метод, который считает площадь треугольника по основанию и высоте, и вернуть значение в место вызова
    public static double countAreaOfTriangle(int a, int h) {
        double area = (a * h) / 2.0;
        return area;
    }

    //Метод расчет периметра квадрата
    public static double countPerimeterOfSquare(double sideSquare) {
        return 4 * sideSquare;
    }

    //Метод расчета периметра трапеции
    public static double countPerimeterOfTrapezoid (double a, double b, double c, double d) {
        return a + b + c + d;
    }

    public static double calculatePerimeterOval(double a, double b) {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    public static double calculatePerimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }




}
