package lessonFive;

public class changeTwo implements Runnable{

    float[] a;

    public changeTwo(float[] a) {
        this.a = a;
    }
    @Override
    public void run() {
        for (int i = 0; i < a.length; i++) {
            a[i] = (float)(a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
