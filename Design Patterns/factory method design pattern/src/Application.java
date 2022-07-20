public class Application {
    public static void main(String[] args) {
        Packege aPackage=PackageFactory.cratePackage(PackageCode.Strong);
        System.out.println(aPackage);

        Packege aPackage1=PackageFactory.cratePackage(PackageCode.Medium);
        System.out.println(aPackage1);

        Packege aPackage2=PackageFactory.cratePackage(PackageCode.Easy);
        System.out.println(aPackage2);
    }

}
