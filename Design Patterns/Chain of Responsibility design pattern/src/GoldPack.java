public class GoldPack extends Handler{
    @Override
    public double applyPoints(Message message) {
        message.setPoints(message.getPoints()+message.getMarks()*0.01);
        if(message.getMarks()<=50){
            return message.getPoints();
        }else{
            return successor.applyPoints(message);
        }


    }
}
