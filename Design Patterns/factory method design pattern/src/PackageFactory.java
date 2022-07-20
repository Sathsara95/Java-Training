public class PackageFactory {
    public static Packege cratePackage(PackageCode packageCode){
        switch(packageCode){
            case Strong:
                return new StrongPackage();
            case Medium:
                return new MediumPackage();
                case Easy:
                    return new EasyPackage();
            default:
                return null;
        }
    }
}
