public class Student extends Persion {
    String SNo;

    public String getSNo() {
        return SNo;
    }

    public void setSNo(String SNo) {
        this.SNo = SNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + SNo +
                '}';
    }
}
