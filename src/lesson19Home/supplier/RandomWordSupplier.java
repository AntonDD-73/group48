package lesson19Home.supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

class RandomWordSupplier implements Supplier<String> {
    private final List<String> words;
    private final Random random;

    public RandomWordSupplier(List<String> words) {
        this.words = words;
        this.random = new Random();
    }

    @Override
    public String get() {
        return words.get(random.nextInt(words.size()));
    }
}
