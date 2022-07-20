public class Message  {
    private int messageNO;
    private double marks;
    private double points;

  protected void setPoints(double points){
      this.points=points;
  }


  public Message(int messageNO, double marks){
      this.messageNO=messageNO;
      this.marks=marks;
  }

  public int getMessageNO(){
      return  messageNO;
  }
  public double getMarks(){return marks;}

    public double getPoints(){return points;}

}
