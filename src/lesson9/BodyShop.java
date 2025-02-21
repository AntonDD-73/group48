package lesson9;

/**
 * Кузовной цех
 */
public class BodyShop {

    public void toColorCar(Car car, String color) {
        car.setColor(color);
    }

    public void toIncrementNumber(int number) {
        number++;
    }
}
