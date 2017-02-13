package fluentinterface;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        PasswordValidator pv = new PasswordValidator(8, "Tr0ub4d0ur!");
        pv.checkLength().specialCharacters().valid();


        StringBuffer sb = new StringBuffer("a");
        sb.append('c').append(true).insert(1, "qqqq");
        System.out.println(sb.toString());
    }
}
