package enums;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class EnumMain {

    enum CardColours {
        HEART, SPADES,
        DIAMONDS, CLUBS
    }

    public static void main(String[] args) {
        CardColours cc = CardColours.HEART;
        String whatShouldISay = "bez atu";
        switch(cc) {
            case HEART: // do something
        }
        System.out.println(CardColours.CLUBS + " are weakest of them all");
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }
    }
}
