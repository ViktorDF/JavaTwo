package lessonOne;

public class Robot implements Participant{
    private final int maxRun;
    private final int maxJump;
    private boolean resultJump;
    private boolean resultRun;

    public Robot (int maxRun, int maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.resultJump = true;
        this.resultRun = true;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Робот смог пробежать");
        } else {
            resultRun = false;
            System.out.println("Робот не смог пробежать");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println("Робот смог перепрыгнуть");
        } else {
            resultJump = false;
            System.out.println("Робот не смог перепрыгнуть");
        }
    }


    @Override
    public void showResults() {
        System.out.println(getClass().getSimpleName() + " distance " + result());
    }

    @Override
    public boolean result() {
        return resultJump && resultRun;
    }
}
