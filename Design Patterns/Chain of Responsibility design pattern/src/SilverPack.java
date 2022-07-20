public class SilverPack extends Handler {

        @Override
        public double applyPoints(Message message) {
            message.setPoints(message.getPoints()+message.getMarks()*0.02);
            System.out.println("Silver Pack activeted");
            if(message.getMarks()>50 && message.getMarks()<=100 ){
                return message.getPoints();
            }else{
                return successor.applyPoints(message);
            }


        }


}
