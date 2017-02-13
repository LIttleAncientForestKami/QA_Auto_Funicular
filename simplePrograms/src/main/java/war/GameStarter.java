package war;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class GameStarter {

    static void start() {
        InputHandler ih = new InputHandler();

        Deck d = new Deck();
        d.shuffle();
        System.out.println(d.dealPlayer1Cards());
        System.out.println(d.dealPlayer2Cards());


//        Player p1 = new Player(ih.askForPlayerName(), d.dealPlayer1Cards());
//        Player p2 = new Player(ih.askForPlayerName(), d.dealPlayer2Cards());
    }

}
