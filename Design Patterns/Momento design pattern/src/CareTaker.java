import java.util.Stack;

public class CareTaker {
    Stack<Registery.RegisteryMomento> book=new Stack<>();

    public void save(Registery registery){
        book.push(registery.save());
    }

    public void revert(Registery registery){
        if(!book.isEmpty()) {
            registery.revert(book.pop());
        }
        else {
            System.out.println("Can't undo");
        }

    }
}
