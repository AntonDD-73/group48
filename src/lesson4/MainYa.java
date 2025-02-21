package lesson4;

public class MainYa {
    public static void main(String[] args) {
        int[] emptyArray = new int[10];

        System.out.println("Читаем значения пустого массива");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            System.out.println(number);
        }
        System.out.println("\nЗаполняем массив числами от 1 до 10");
        for (int index = 0; index < emptyArray.length; index++) {
            emptyArray[index] = index;
        }
        System.out.println("\nЧитаем значения заполненного массива");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            System.out.println(number);
        }

        int[] numbersArray = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        System.out.println("\nВывести на консоль массив с обратной стороны");
        for (int index = numbersArray.length - 1; index >= 0; index--) {
            System.out.println(numbersArray[index]);
        }

        System.out.println("\nВывести на консоль те числа которые содержат символ 5");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];

            // Преобразуем число в строку
            //Вариант 1 - через конкатенацию
            //String stringNumber = number + "";

            //Вариант 2 - через специальный метод
            String stringNumber = String.valueOf(number);
            if (stringNumber.contains("5")) {
                System.out.println(number);
            }
        }

        System.out.println("\nСоздать двухмерный массив с числами и вывести на консоль");
        int[][] numbers = {
                {1, 2, 3},
                {3, 5, 6},
                {5, 3, 2},
                {1, 4, 5}
        };

        //nested - вложенный
        for (int verticalIndex = 0; verticalIndex < numbers.length; verticalIndex++) {
            int[] nestedArray = numbers[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                int number = nestedArray[horizontalIndex];
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("\nСоздать массив чисел и вывести его диагоноль");
        int[][] array = {
                {1, 6, 3, 4, 5, 7},
                {12, 54, 3, 12, 4, 3},
                {1, 5, 2, 53, 5, 3},
                {7, 54, 23, 54, 23},
                {25, 4564, 4, 3, 23, 32},
                {234, 5, 3, 1, 6, 3}
        };

        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex + horizontalIndex == 5) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\nСоздать пустой массив и заполнить все его значемями 15");
        int[][] simpleArray = new int[6][6];
        //если хотим наполнить вручную
        simpleArray[0][0] = 1;
        simpleArray[0][1] = 2;
        simpleArray[3][2] = 3;

        //Если циклом

        for (int verticalIndex = 0; verticalIndex < simpleArray.length; verticalIndex++) {
            int[] nestedArray = simpleArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                nestedArray[horizontalIndex] = 15;
            }
        }
    }
}