package war;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Cards {

    private List<Integer> cards = new ArrayList<>();

    Cards(List<Integer> halfOfTheDeck) {
        this.cards = halfOfTheDeck;
    }

    public void add(Integer integer) {
        cards.add(integer);
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cards=" + cards +
                '}';
    }

}
