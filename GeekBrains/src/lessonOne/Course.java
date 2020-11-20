package lessonOne;

public class Course {

    Obstacles[] obstacles;

    public Course(Obstacles... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        Participant[] pp = team.getMemberTeam();
        for (Participant p : pp) {
            System.out.println("Участник " + p.getClass().getSimpleName() + ":");
            for (Obstacles o : obstacles) {
                o.doIt(p);
                if (!p.result()) break;
            }
            System.out.println();
        }
    }
}
