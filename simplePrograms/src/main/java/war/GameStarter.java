package war;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class GameStarter {

    static void start() {
        InputHandler ih = new InputHandler();

        // cards (not done)
        Deck d = new Deck();
        d.shuffle();
        Player p1 = new Player(ih.askForPlayerName(), d.dealPlayerCards());
        Player p2 = new Player(ih.askForPlayerName(), d.dealPlayerCards());

    }

}
