package war;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 52 cards as numbers, colours not stored.
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Deck {
    private List<Integer> l = new ArrayList<>(52);
    private Cards givenAway = null;

    public Deck() {
        IntStream.rangeClosed(2,14).forEach(cardNr ->
                IntStream.range(0,4).forEach(a -> {
                    l.add(cardNr);
                    // 4 times cause 4 colours
                }));

    }

    List<Integer> shuffle() {
        return null;
    }

    Cards dealPlayerCards() {
        return null;
    }
}
