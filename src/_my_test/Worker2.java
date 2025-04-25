package _my_test;

// 인터페이스 Runnable 를 사용해서 쓰레드를 설계
public class Worker2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Worker" + i + "가 일을 진행합니다.");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 테스트 코드 (실행하는 코드)
    public static void main(String[] args) {
        System.out.println("main Thread가 worker2에게 일을 시킵니다.");
        Worker2 worker2 = new Worker2();

        // Thread 생성자 종류
        //Thread();
        //Thread(Runnable target) // 여기선 해당 생성자를 사용
        //Thread(Runnable target, String name)
        //Thread(String name)
        //Thread(ThreadGroup group, Runnable target)
        //Thread(ThreadGroup group, Runnable target, String name)
        //Thread(ThreadGroup group, Runnable target, String name, long stackSize)
        //Thread(ThreadGroup group, String name)

        Thread walkingWorker2 = new Thread(worker2);
        walkingWorker2.start();
    }
}
