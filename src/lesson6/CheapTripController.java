package lesson6;

import java.util.Scanner;

/**
 * Контроллер приложения
 */
public class CheapTripController {
    private CheapTripDB db = new CheapTripDB();

    public void start() {
        System.out.println("\nДобро пожаловать в CheapTrip!");
        System.out.println("Я робот-помощник Варвара.");
        System.out.println("Я помогу выбрать вам тур по душе.");
        System.out.println("Что вы хотите посмотреть?");
        while(true) {
            printMenu();
            printResult();
        }
    }

    private void printResult() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                db.getAllTours();
                break;
            case 2:
                System.out.println("Введите желаемую страну");
                String country = scanner.next();
                db.getToursByCountry(country);
                break;
            case 3:
                System.out.println("Введите желаемый город");
                String city = scanner.next();
                db.getToursByCity(city);
                break;
            case 4:
                System.out.println("Введите ваш бюджет");
                int price = scanner.nextInt();
                db.getToursByPrice(price);
                break;
            case 5:
                System.out.println("укажите максимальную цену тура");
                int maxPrice = scanner.nextInt();
                System.out.println("Укажите звёздность отеля");
                int stars = scanner.nextInt();
                db.getToursByPriceAndStars(maxPrice, stars);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("К сожалению, такой функции еще нет. Выберите другой пункт меню.");
        }
    }

    private void printMenu() {
        System.out.println("\n1 - Просмотр всех туров");
        System.out.println("2 - Поиск туров по стране");
        System.out.println("3 - Поиск туров по городу");
        System.out.println("4 - Поиск туров по цене");
        System.out.println("5 - Поиск по цене и по звездам одновременно");
        System.out.println("0 - Выход");
    }
}
