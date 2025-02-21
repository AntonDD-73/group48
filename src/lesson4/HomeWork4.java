package lesson4;

public class HomeWork4 {
    public static void main(String[] args) {
        //Домашнее задание
        //1) Создать массив 6 на 6 сразу с числами
        //2) Перезаписать во все ячейки нули (0)
        //3) Вывести диагональ сверху вниз
        //4) Вывести в шахматном порядке

        System.out.println("1. Создать массив 6 на 6 сразу с числами");
        int[][] numbersArray = {
                {1, 6, 3, 4, 5, 7},
                {12, 54, 3, 12, 3, 5},
                {1, 5, 2, 53, 5, 3},
                {7, 54, 23, 54, 9, 23},
                {25, 44, 4, 3, 32, 7},
                {24, 5, 3, 1, 6, 3,}
        };
        for (int verticalIndex = 0; verticalIndex < numbersArray.length; verticalIndex++) {
            int[] nestedArray = numbersArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                int number = nestedArray[horizontalIndex];
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("\n2. Перезаписать во все ячейки нули (0)");

        for (int verticalIndex = 0; verticalIndex < numbersArray.length; verticalIndex++) {
            int[] nestedArray = numbersArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                nestedArray[horizontalIndex] = 0;
                int number = nestedArray[horizontalIndex];
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("\n3. Вывести диагональ сверху вниз");
        for (int verticalIndex = 0; verticalIndex < numbersArray.length; verticalIndex++) {
            int[] nestedArray = numbersArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex - horizontalIndex == 0 ) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number);
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\n4. Вывести в шахматном порядке");
        for (int verticalIndex = 0; verticalIndex < numbersArray.length; verticalIndex++) {
            int[] nestedArray = numbersArray[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if ((verticalIndex + horizontalIndex) % 2 == 0 ) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
