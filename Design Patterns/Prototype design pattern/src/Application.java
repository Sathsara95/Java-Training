public class Application {
    public static void main(String[] args) {
        Registry registry=new Registry();
        Student student=(Student) registry.getPersion(PersionCategory.Student);
        System.out.println(student);

        student.setSNo("Nimal0N1");
        System.out.println(student);

        Student student1=(Student)registry.getPersion(PersionCategory.Student);
        System.out.println(student1);

    }
}
