package _my_test;

// 상속을 통해서 Thread를 만드는 방법
public class Worker extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Worker" + i + "가 일을 진행합니다.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 테스트 코드 (실행하는 코드)
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println("main 쓰레드에서 worker 일 시킵니다.");
        worker.start();
        System.out.println("main 쓰레드에서 worker 일을 시킨 후 종료 합니다.");

    }
}
