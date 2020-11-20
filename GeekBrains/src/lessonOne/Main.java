package lessonOne;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Wall(15) ,new Treadmill(400));
        Team team = new Team("Tesla", new Cat(200,15), new Human(500, 55), new Robot(1000, 10), new Robot(1500, 15));
        course.doIt(team);
        System.out.println("---------------");
        team.showResults();
        System.out.println("---------------");
        team.showFinishResults();
    }
}
