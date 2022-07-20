public class Application {

    public static void main(String[] args) {
        GoldPack goldPack=new GoldPack();
        SilverPack silverPack=new SilverPack();
        LocalPack localPack=new LocalPack();
        Points points =new Points();

        points.setSuccessor(goldPack);
        goldPack.setSuccessor(silverPack);

        Message message=new Message(1,50);
        System.out.println(points.applyPoints(message));

        Message message1=new Message(1,150);
        System.out.println(points.applyPoints(message1));



        Message message3=new Message(1,250);
        System.out.println(points.applyPoints(message3));

    }
}
