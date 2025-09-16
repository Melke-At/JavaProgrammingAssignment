import java.util.Random;
public class ParallelNumberSum {
    static class SumThread extends Thread{
        private int[] array;
        int start;
        int end;
        private  long partialSum;

        public SumThread(int[] array, int start, int end){
            this.array = array;
            this.start = start;
            this.end = end;
        }

        public long getPartialSum(){
            return partialSum;
        }

        @Override
        public void run() {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            partialSum = sum;
        }
    }

    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];

        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(1000); // numbers between 0–999
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available CPU cores: " + cores);

        SumThread[] threads = new SumThread[cores];
        int chunkSize = size / cores;

        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? size : start + chunkSize;
            threads[i] = new SumThread(numbers, start, end);
            threads[i].start();
        }

        long totalSum = 0;
        for (SumThread t : threads) {
            try {
                t.join();
                totalSum += t.getPartialSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total sum of array: " + totalSum);
    }
}




