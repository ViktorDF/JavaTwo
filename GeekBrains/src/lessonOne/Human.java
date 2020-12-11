package lessonOne;

public class Human implements Participant{
    private final int maxRun;
    private final int maxJump;
    private boolean resultJump;
    private boolean resultRun;

    public Human (int maxRun, int maxJump) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.resultJump = true;
        this.resultRun = true;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Человек смог пробежать");
        } else {
            resultRun = false;
            System.out.println("Человек не смог пробежать");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println("Человек смог перепрыгнуть");
        } else {
            resultJump = false;
            System.out.println("Человек не смог перепрыгнуть");
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
