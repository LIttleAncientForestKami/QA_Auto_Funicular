package packages.apackage;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class ChildClass extends PackageVisibilityTest {
    void sees() {
        System.out.println(super.protectedMethod());
        System.out.println(super.publicMethod());
        System.out.println(super.packageMethod());
//        System.out.println(super.privateMethod()); // compilation error
    }
    public static void main(String[] args) {
        ChildClass childInside = new ChildClass();
        childInside.sees();
    }

}
