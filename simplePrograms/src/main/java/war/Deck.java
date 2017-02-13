package war;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * 52 cards as numbers, colours not stored.
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Deck {
    private List<Integer> cardNumbers = new ArrayList<>(52);
    private List<Integer> givenAway = null;

    public Deck() {
        IntStream.rangeClosed(2,14).forEach(cardNr ->
                IntStream.range(0,4).forEach(a -> {
                    cardNumbers.add(cardNr);
                    // 4 times cause 4 colours
                }));

    }

    void shuffle() {
        Random r = new Random();
        List<Integer> shuffled = new ArrayList<>(52);

        IntStream.rangeClosed(0,51).forEach(index -> {
            if (cardNumbers.size() == 1) {
                int random = r.nextInt(51);
                shuffled.add(shuffled.remove(random));
                shuffled.add(random, cardNumbers.get(0));
            } else {
                int random = r.nextInt(cardNumbers.size() - 1);
                shuffled.add(index, cardNumbers.remove(random));
            }
        });
        cardNumbers = shuffled;
    }

    Cards dealPlayer1Cards() {
        List<Integer> tmp = new ArrayList<>(26);
        IntStream evens = IntStream.iterate(0, operand -> operand+2);
        evens.limit(26).forEach(i -> tmp.add(cardNumbers.get(i)));
        return new Cards(tmp);
    }

    Cards dealPlayer2Cards() {
        List<Integer> tmp = new ArrayList<>(26);
        IntStream odds = IntStream.iterate(1, operand -> operand+2);
        odds.limit(26).forEach(i -> tmp.add(cardNumbers.get(i)));
        return new Cards(tmp);
    }
}
