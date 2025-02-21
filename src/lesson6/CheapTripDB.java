package lesson6;

/**
 * База данных тура
 */
public class CheapTripDB {
    private Tour[] tours = new Tour[100];

    public CheapTripDB() {
        addTour("Турция", "Стамбул", "Самолет", 5, 100_000, 3, "завтрак");
        addTour("Турция", "Анталья", "Самолет", 7, 150_000, 5, "завтрак");
        addTour("Италия", "Рим", "Автобус", 10, 150_000, 4, "все включено");
        addTour("Турция", "Самсун", "Паром", 5, 70000, 2, "завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 9, 135_000, 4, "все включено");
        addTour("Россия", "Алтай", "Поезд", 4, 78000, 5, "завтрак");
        addTour("Иран", "Шираз", "Самолет", 5, 80000, 4, "завтрак");
        addTour("Шри-ланка", "Коломбо", "Самолет", 10, 200_000, 5, "все включено");
    }

    public void addTour(String country, String city, String transport, int days, int price, int stars, String food) {
        Tour tour = new Tour(country, city, transport, days, price, stars, food);

        for (int index = 0; index < tours.length; index++) {
            if (tours[index] == null) {
                tours[index] = tour;
                return;
            }
        }
    }

    public void getAllTours() {
        boolean found = false;
        for (Tour tour : tours) {
            if (tour != null) {
                System.out.println(tour);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет доступных туров");
        }
    }

    public void getToursByPrice(int price) {
        boolean found = false;
        for (Tour tour : tours) {
            if (tour != null && tour.getPrice() <= price) {
                System.out.println(tour);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет туров по указанной цене.");
        }
    }

    public void getToursByCountry(String country) {
        boolean found = false;
        System.out.println("Туры в страну: " + country);

        for (Tour tour : tours) {
            if (tour != null && tour.getCountry().equalsIgnoreCase(country)) {
                System.out.println(tour);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет туров в страну: " + country);
        }
    }

    public void getToursByCity(String city) {
        boolean found = false;
        System.out.println("Туры в город: " + city);

        for (Tour tour : tours) {
            if (tour != null && tour.getCity().equalsIgnoreCase(city)) {
                System.out.println(tour);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет туров в город: " + city);
        }
    }

    public void getToursByPriceAndStars(int maxPrice , int stars) {
        boolean found = false;
        System.out.println("Максимальная цена тура-" + maxPrice + " Звёздность отеля-" + stars);

        for (Tour tour : tours) {
            if (tour != null && tour.getPrice() <= maxPrice && tour.getStars() <= stars)
                System.out.println(tour);
                found = true;
            }

        if (!found) {
            System.out.println("Нет подходящих туров по указанным параметрам");
        }
    }

}
