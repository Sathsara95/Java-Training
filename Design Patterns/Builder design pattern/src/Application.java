public class Application {
    public static void main(String[] args) {
       Customer.Builder builder=new Customer.Builder("yes");
       Customer customer=builder.bikeTraining("yes").carTraining("no").threewheelerTraining("no").build();
        System.out.println(customer);

        Customer customer1=builder.carTraining("yes").build();
        System.out.println(customer1);
    }
}
