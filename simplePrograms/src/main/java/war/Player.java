package war;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Player {
    private final String name;
    private Cards cards;

    public Player(String name, Cards halfOfTheDeck) {
        this.name = name;
        this.cards = halfOfTheDeck;
    }
}
