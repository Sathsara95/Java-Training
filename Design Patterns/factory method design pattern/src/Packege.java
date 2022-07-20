import java.util.ArrayList;
import java.util.List;

public abstract class Packege {
    protected List<Tranining> tranining =new ArrayList<>();

    public Packege(){
        createPackage();
    }
    protected abstract void createPackage();

    @Override
    public String toString(){
        return"training{"+ tranining +"}";
    }
}
