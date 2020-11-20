package lessonOne;

public class Treadmill extends Obstacles{

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(distance);
    }
}
