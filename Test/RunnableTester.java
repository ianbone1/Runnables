import trivera.core.threads.SimpleRunnable;

public class RunnableTester {

    public static void main(String[] args) {

        SimpleRunnable run1 = new SimpleRunnable();
        SimpleRunnable run2 = new SimpleRunnable();
        SimpleRunnable run3 = new SimpleRunnable();
        SimpleRunnable run4 = new SimpleRunnable();
        SimpleRunnable run5 = new SimpleRunnable();

        Thread thread1 = new Thread(run1, "Run-1");
        Thread thread2 = new Thread(run2, "Run-2");
        Thread thread3 = new Thread(run3, "Run-3");
        Thread thread4 = new Thread(run4, "Run-4");
        Thread thread5 = new Thread(run5, "Run-5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
