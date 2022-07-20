public class Ticket {
    String name;
    public Ticket(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                '}';
    }
}
