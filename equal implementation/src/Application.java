public class Application {
    public static void main(String[] args) {
        Employee emp1=new Employee(001,"EMP01","Nimal", "930940570V","Colombo");
        Employee emp2=new Employee(001,"EMP01","Nimal", "930940570V","Colombo");

        System.out.println("emp1.equals(emp2): "+emp1.equals(emp2));


        Employee emp3=new Employee(002,"EMP02","Dasun", "990358758V","Anuradhapura");

        System.out.println("emp1.equals(emp3): "+emp1.equals(emp3));
        System.out.println("emp1.equals(emp3): "+emp2.equals(emp3));
    }
}
