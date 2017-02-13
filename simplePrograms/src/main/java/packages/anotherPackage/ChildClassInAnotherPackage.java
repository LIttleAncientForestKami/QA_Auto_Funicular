package packages.anotherPackage;

import packages.apackage.PackageVisibilityTest;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class ChildClassInAnotherPackage extends PackageVisibilityTest {

    void sees() {
        System.out.println(super.protectedMethod());
        System.out.println(super.publicMethod());
//        System.out.println(super.packageMethod()); // compilation error
//        System.out.println(super.privateMethod()); // compilation error
    }
    public static void main(String[] args) {
        ChildClassInAnotherPackage childOutside = new ChildClassInAnotherPackage();
        childOutside.sees();
    }
}
