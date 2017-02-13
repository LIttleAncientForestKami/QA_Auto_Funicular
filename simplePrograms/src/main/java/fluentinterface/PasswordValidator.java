package fluentinterface;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class PasswordValidator {
    private final int reqLength;
    private final String toValidate;
    private boolean ok = false;

    PasswordValidator(int requiredLength, String password) {
        this.reqLength = requiredLength;
        toValidate = password;
    }

    PasswordValidator checkLength() {
        ok = toValidate.length() > reqLength;
        return this;
    }

    PasswordValidator specialCharacters() {

        return this;
    }

    boolean valid() {
        return ok;
    }
}
