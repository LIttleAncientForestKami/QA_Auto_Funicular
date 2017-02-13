package packages.apackage;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class PackageVisibilityTest {
    public String publicMethod() {
        return "public";
    }
    protected String protectedMethod() {
        return "protected";
    }
    String packageMethod() {
        return "default";
    }
    private String privateMethod() {
        return "private";
    }
}
