package lesson20Home;

import java.util.Comparator;

public class getIncomePerArea implements Comparator<Shop> {

    @Override
    public int compare(Shop o1, Shop o2) {
        if (o1.getArea() <= 0 || o2.getArea() <= 0) {
            throw new IllegalArgumentException("Площадь магазина должна быть больше 0");
        }
        double ratio1 = (double) o1.getIncome() / o1.getArea();
        double ratio2 = (double) o2.getIncome() / o2.getArea();

        return Double.compare(ratio2, ratio1);
    }
}

