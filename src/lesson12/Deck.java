package lesson12;

import java.util.concurrent.ThreadLocalRandom;

public class Deck {
   private Card[] cards = new Card[52];
   
   public Deck() {
      addCard(2, "Двойка крести");
      addCard(2, "Двойка бубна");
      addCard(2, "Двойка пика");
      addCard(2, "Двойка черви");

      addCard(3, "Тройка крести");
      addCard(3, "Тройка бубна");
      addCard(3, "Тройка пика");
      addCard(3, "Тройка черви");

      addCard(4, "Четверка крести");
      addCard(4, "Четверка бубна");
      addCard(4, "Четверка пика");
      addCard(4, "Четверка черви");

      addCard(5, "Пятерка крести");
      addCard(5, "Пятерка бубна");
      addCard(5, "Пятерка пика");
      addCard(5, "Пятерка черви");

      addCard(6, "Шестерка крести");
      addCard(6, "Шестерка бубна");
      addCard(6, "Шестерка пика");
      addCard(6, "Шестерка черви");

      addCard(7, "Семерка крести");
      addCard(7, "Семерка бубна");
      addCard(7, "Семерка пика");
      addCard(7, "Семерка черви");

      addCard(8, "Восьмерка крести");
      addCard(8, "Восьмерка бубна");
      addCard(8, "Восьмерка пика");
      addCard(8, "Восьмерка черви");

      addCard(9, "Девятка крести");
      addCard(9, "Девятка бубна");
      addCard(9, "Девятка пика");
      addCard(9, "Девятка черви");

      addCard(10, "Десятый крести");
      addCard(10, "Десятый бубна");
      addCard(10, "Десятый пика");
      addCard(10, "Десятый черви");

      addCard(2, "Валет крести");
      addCard(2, "Валет бубна");
      addCard(2, "Валет пика");
      addCard(2, "Валет черви");

      addCard(3, "Дама крести");
      addCard(3, "Дама бубна");
      addCard(3, "Дама пика");
      addCard(3, "Дама черви");

      addCard(4, "Король крести");
      addCard(4, "Король бубна");
      addCard(4, "Король пика");
      addCard(4, "Король черви");

      addCard(11, "Туз крести");
      addCard(11, "Туз бубна");
      addCard(11, "Туз пика");
      addCard(11, "Туз черви");
   }

   public Card getRandomCard() {
      int randomIndex = ThreadLocalRandom.current().nextInt(0, cards.length);
      return cards[randomIndex];
   }

   private void addCard(int nominal, String suit) {
      Card card = new Card(nominal, suit);

      for (int index = 0; index < cards.length; index++) {
         if (cards[index] == null) {
            cards[index] = card;
            return;
         }
      }
   }
}
