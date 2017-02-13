package packages.apackage;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class AnotherPackageClass {
    void sees() {
        PackageVisibilityTest pvt = new PackageVisibilityTest();
        System.out.println(pvt.protectedMethod());
        System.out.println(pvt.publicMethod());


        System.out.println(pvt.packageMethod());
    //    System.out.println(pvt.privateMethod()); // compilation error
    }
    public static void main(String[] args) {
        AnotherPackageClass neighbour = new AnotherPackageClass();
        neighbour.sees();
    }



}
