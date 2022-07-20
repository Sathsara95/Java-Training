import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<PersionCategory, Persion> persions=new HashMap<>();

    public Registry(){
        this.initialize();
    }

    private void initialize() {
        Teacher teacher=new Teacher();
        teacher.setId("01");
        teacher.setName("Darmasena");
        teacher.setAddress("Kalutara");
        teacher.setSalary(2000);

        Student student=new Student();
        student.setId("01");
        student.setName("Darmasena");
        student.setAddress("Kalutara");
        student.setSNo("Darmasena00d1");

        persions.put(PersionCategory.Student,student);
        persions.put(PersionCategory.Teacher,teacher);
    }

    public Persion getPersion(PersionCategory persionCategory) {
        Persion persion=null;
        try {
             persion=(Persion)persions.get(persionCategory).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return persion;
    }

}
