public class OddEvenThreadDemo {
    public static void main(String[] args){
        int start = 1;
        int end = 20;

        Thread evenThread = new Thread(new EvenNumberWriter(start, end));
        Thread oddThread = new Thread(new OddNumberWriter(start, end));

        evenThread.start();
        try {
            evenThread.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        oddThread.start();
        try {
            oddThread.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Printing complete. ");
    }
}