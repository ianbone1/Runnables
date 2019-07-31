package trivera.core.threads;

public class SimpleRunnable implements Runnable{


    public void run() {
        for (int a = 0; a<10_000_000; a++){
            System.out.println(Thread.currentThread().getName() + " : " + a);
        }
    }

    public static void main(String[] args){



    }


}
