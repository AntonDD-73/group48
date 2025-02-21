package lesson2;

public class main {
    public static void main(String[] args) {
        char firstCharter = 'Д';
        char secondCharter = 'О';
        char thirdCharter = 'М';
        System.out.println("" + firstCharter + secondCharter + thirdCharter );
        //Процесс склеивания строк - конкатенаия

        // \n - символ, который позволяет отступить одну строку заменив sout
        // = - это приравнивание например а = 5
        // == - это сравнение, вопрос равно ли, например 10 == 5 (они не равны, значит false)
        //!= - это сравнение, вопрос не равно ли, например 10 !=5 (они не равны, значит true)
        System.out.println("\nПример работы с типом данных boolean");
        boolean isEquals = 10 == 5;
        System.out.println(isEquals);

        double firstDouble = 1.5;
        double secondDouble = 1.5;
        System.out.println(firstDouble == secondDouble);
        System.out.println(67 != 87);

        //++ - увелечение на 1
        System.out.println("\nМатематические операции с логическими операторами");
        int firstNumber = 10;
        int secondNumber = 12;
        System.out.println(++firstNumber);
        System.out.println(secondNumber++);
        System.out.println(--secondNumber);
        //% -
        System.out.println("\nПроверка числа на честность");
        int remain = 13 % 2;
        System.out.println("Остаток от деления 13 на 2: " + remain);
        boolean isEven = remain == 0;
        System.out.println("Число 13 четное: " + isEven);

        System.out.println("\nЕсть 3 стороны треугольника. Нужно напечатать на консоль слово: Равнобедренный, " +
                "Равносторонний или Разносторонний, в зависимости от того, какой это треугольник");
        int a = 7;
        int b = 9;
        int c = 5;

        //&& - Логический оператор "И", если в цепочке сравнение true && true && false, хотя результат false
        //if на вход принимает результат выражения сравнения либо true, либо false
        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b !=c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else  {
            System.out.println("Это равнобедренный треугольник");
        }

        System.out.println("\nНеобходимо вывести в консоль 10 раз словосочетание Привет, Мир!");
               for (int index = 0; index < 10; index++) {
            System.out.println("Привет, Мир!");
        }

        System.out.println("\nНапечатать числа от 30 до 300, кратные 3 и 5 (деляться без остатка на 3 и 5)");
            for (int number = 30; number < 300; number++) {
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println(number);
                }
            }

        System.out.println("Бумажный дом\n" +
                "Сколько денег мы вынесем из банка, если будем у нас уже есть 10 млн и мы будем печать деньги еще 15 дней," +
                " таким образом, что сумма будет увеличиваться ежедневно на 13 %");
        int money = 10_000_000;
        for (int day = 0; day < 15; day++) {
            money = money + (money / 100 * 13);
        }
        System.out.println("Мы вынесем из банка: " + money + " денег");
    }
}
