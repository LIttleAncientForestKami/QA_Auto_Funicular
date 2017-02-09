import java.util.Scanner;

/*
 * Greets by name:
 * - asking for a name (current version)
 * - getting a name from command line (as a program parameter, now commented out)
 */
public class HelloName {
    public String getGreeting(String name) {
        return "Hello "+name;
    }

    public String askUserForAName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Your name?");
        return in.nextLine();
    }

    public static void main(String[] args) {
        HelloName a = new HelloName();
        System.out.println(a.getGreeting(a.askUserForAName()));
//        System.out.println(new HelloName().getGreeting(args[0]));
    }
}
