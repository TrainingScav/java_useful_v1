package thread;

public class Worker2 implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(i + "\t");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
