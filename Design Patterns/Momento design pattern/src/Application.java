public class Application {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Registery registery=new Registery();
        registery.addTicket(new Ticket("Kandy"));
        registery.addTicket(new Ticket("Colombo"));


        careTaker.save(registery);
        System.out.println(registery);
        registery.addTicket(new Ticket("Galle"));
        careTaker.save(registery);
        System.out.println(registery);



        registery.addTicket(new Ticket("Jaffna"));
        //careTaker.save(registery);
        System.out.println(registery);


        careTaker.revert(registery);
        careTaker.revert(registery);
        System.out.println(registery);
        careTaker.revert(registery);

        registery.addTicket(new Ticket("Panadura"));
        // careTaker.save(registery);

        System.out.println(registery);
        careTaker.revert(registery);
        System.out.println(registery);
        careTaker.revert(registery);
        System.out.println(registery);
        careTaker.revert(registery);
        System.out.println(registery);
    }
}
