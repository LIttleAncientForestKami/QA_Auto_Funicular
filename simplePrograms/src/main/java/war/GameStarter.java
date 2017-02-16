package war;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class GameStarter {

    static void start() {
        InputHandler ih = new InputHandler();

        Deck d = new Deck();
        d.shuffle();

        Player p1 = new Player(ih.askForPlayerName(), d.dealPlayer1Cards());
        Player p2 = new Player(ih.askForPlayerName(), d.dealPlayer2Cards());
        return new Game(p1, p2)
    }

}
