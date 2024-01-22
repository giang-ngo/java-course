package introduction_to_java;

public class Lesson10_ex2 {
    public static void main(String[] args) {
        var buffer = new StringBuffer();
        var task1 = new MyRunnable(buffer, "Hello ", 500);
        var task2 = new MyRunnable(buffer, "World ", 800);
        var thread1 = new Thread(task1);
        var thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(STR."Kết quả: \{buffer}");
    }
}

class MyRunnable implements Runnable {
    private final StringBuffer buffer;
    private final String message;
    private final int duration;

    public MyRunnable(StringBuffer buffer, String message, int sleepDuration) {
        this.buffer = buffer;
        this.message = message;
        this.duration = sleepDuration;
    }

    @Override
    public void run() {
//        Chạy tuần tự
        synchronized (buffer) {
            buffer.append(message);
            System.out.println(buffer);
            try {
                Thread.sleep(duration);
                buffer.append(message);
                System.out.println(buffer);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
