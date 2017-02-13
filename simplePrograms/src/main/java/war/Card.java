package war;

import java.util.Comparator;

/**
 * Represents a Card as an Integer. Answers comparisons.
 *
 * This does NOT care or store the card colour.
 *
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Card {

    enum CardComparisonResults {
        LOSS(-1), DRAW(0), WIN(1);

        private final int result;

        CardComparisonResults(int i) {
            this.result = i;
        }
    }
    private final int value;

    Card(int val) {
        this.value = val;
    }

    int getValue() {
        return this.value;
    }

    int compareTo(Card anotherCard) {
        final int otherValue = anotherCard.getValue();

        return (otherValue == this.value) ? 0
                : otherValue > this.value ? -1 : 1;
    }

}
