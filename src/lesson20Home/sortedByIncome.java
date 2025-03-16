package lesson20Home;

import java.util.Comparator;

public class sortedByIncome implements Comparator<Shop> {
    @Override
    public int compare(Shop o1, Shop o2) {
        return Double.compare(o1.getIncome(), o2.getIncome());
    }
}
