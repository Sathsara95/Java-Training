public class Points extends Handler{
    @Override
    public double applyPoints(Message message) {
        return successor.applyPoints(message);
    }
}
