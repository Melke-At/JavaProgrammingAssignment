import java.util.Random;

public class ThreadSafeListTest {
    public static void main(String[] args) {
        ThreadSafeList<String> safeList = new ThreadSafeList<>();
        Random random = new Random();

        Runnable writerTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    String value = Thread.currentThread().getName() + "-val" + i;
                    safeList.add(value);
                }
                try {
                    Thread.sleep(random.nextInt(5)); // simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Runnable removerTask = () -> {
            for (int i = 0; i < 100; i++) {
                safeList.remove(Thread.currentThread().getName() + "-val" + i);
                try {
                    Thread.sleep(random.nextInt(5));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread t1 = new Thread(writerTask, "Writer1");
        Thread t2 = new Thread(writerTask, "Writer2");
        Thread t3 = new Thread(removerTask, "Remover1");
        Thread t4 = new Thread(removerTask, "Remover2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final size of list: " + safeList.size());
    }
}
