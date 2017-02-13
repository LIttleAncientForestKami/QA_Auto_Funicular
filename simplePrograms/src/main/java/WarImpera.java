import java.util.*;
import java.util.stream.IntStream;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class WarImpera {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(52);
        IntStream.rangeClosed(2,14).forEach(cardNr ->
                IntStream.range(0,4).forEach(a -> {
                    l.add(cardNr);
                    // 4 times cause 4 colours
        }));

        System.out.println(l);
        // shuffle

        // deal

        // issue cards / show (simultaneous)

        // compare

            // if draw

        // rearrange decks (winner collects, loser loses cards)

        // rinse and repeat till one side has no cards - announce who won
    }
}
