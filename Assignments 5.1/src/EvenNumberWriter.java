public class EvenNumberWriter implements Runnable {
    private int start;
    private  int end;

    public EvenNumberWriter(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                System.out.println("Even Thread: " + i);
            }
        }
    }
}
