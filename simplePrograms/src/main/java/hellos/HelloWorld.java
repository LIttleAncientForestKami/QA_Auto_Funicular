package hellos;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class HelloWorld {
    public String getGreeting() {
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().getGreeting());
    }

}
