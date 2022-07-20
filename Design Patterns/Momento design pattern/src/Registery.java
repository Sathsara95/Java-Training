import java.util.ArrayList;

//originator
public class Registery {
    ArrayList<Ticket> tickets=new ArrayList<>();

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public ArrayList<Ticket> getTickets() {
        return (ArrayList) tickets.clone();
    }

    public void revert(RegisteryMomento registeryMomento){
        tickets=registeryMomento.getTickets();
    }



    public RegisteryMomento save(){
        return new RegisteryMomento(getTickets());
     }

    @Override
    public String toString() {
        return "Registery{" +
                "tickets=" + tickets +
                '}';
    }

    static class RegisteryMomento{
        ArrayList<Ticket> tickets;

        public RegisteryMomento(ArrayList<Ticket> tickets){
            this.tickets=tickets;
        }

       private ArrayList<Ticket> getTickets() {
            return tickets;
        }
    }
}
