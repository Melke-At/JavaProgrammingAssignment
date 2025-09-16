public class OddNumberWriter implements Runnable {
    private int start;
    private  int end;

    public OddNumberWriter(int start, int end){
        this.start = start;
        this.end = end;
    }

    //@Override
    public void run(){
        for (int i = start; i <= end; i++){
            if (i % 2 !=0){
                System.out.println("Odd Thread: " + i);
            }
        }
    }
}
