
/**
 * Creating a Thread with Runnable interface
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });
        t.start();
        t.join();
        System.out.println("Main Thread is exiting");

    }
}