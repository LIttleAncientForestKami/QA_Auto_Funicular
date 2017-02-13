package war;

import java.util.Scanner;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class InputHandler {
    public String askForPlayerName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
