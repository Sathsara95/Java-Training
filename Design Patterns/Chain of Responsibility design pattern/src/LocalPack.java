public class LocalPack extends Handler {

        @Override
        public double applyPoints(Message message) {
            message.setPoints(message.getPoints()+message.getMarks()*0.04);
            System.out.println("Local Pack activated");

            return message.getPoints();
        }


}
