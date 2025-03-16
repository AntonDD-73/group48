package lesson20.function;

import lesson17Home.Coin;

import java.util.function.Function;

public class CoinMapper implements Function<Coin, ShortCoin> {
    @Override
    public ShortCoin apply(Coin coin) {
        return new ShortCoin(coin.getNominal(), coin.getMetalName());
    }
}
