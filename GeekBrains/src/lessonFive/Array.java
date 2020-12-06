package lessonFive;

public class Array {

    static final int size = 10000000;
    static final int h = size / 2;
    private float[] arr = new float[size];

    public void methodOne() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        change(arr);
        System.out.println("Time methodOne: " + (System.currentTimeMillis() - a));
    }


    public void methodTwo() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);


        Runnable runnable = new changeTwo(a1);
        Runnable runnable1 = new changeTwo(a2);
        new Thread(runnable).start();
        new Thread(runnable1).start();


        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);


        System.out.println("Time methodTwo: " + (System.currentTimeMillis() - a));

    }

    public void change(float[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (float)(a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
