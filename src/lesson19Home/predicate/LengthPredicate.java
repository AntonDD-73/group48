package lesson19Home.predicate;

import java.util.function.Predicate;

public class LengthPredicate implements Predicate<String> {
    private final int minLength;

    public LengthPredicate(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean test(String word) {
        return word.length() > minLength;
    }
}
