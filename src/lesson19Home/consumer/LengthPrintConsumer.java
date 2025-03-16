package lesson19Home.consumer;

import java.util.function.Consumer;

class LengthPrintConsumer implements Consumer<String> {
    @Override
    public void accept(String word) {
        if (word != null && !word.isEmpty()) {
            System.out.println(word + " (длина: " + word.length() + ")");
        }
    }
}
