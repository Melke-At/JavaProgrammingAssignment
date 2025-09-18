import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class ThreadSafeList<T> {
    private List<T> list = new ArrayList<>();

    public synchronized void add(T elment){
        list.add(elment);
    }

    public synchronized boolean remove(T element){
        return list.remove(element);
    }

    public synchronized int size(){
        return list.size();
    }

    public synchronized T get(int index){
        return  list.get(index);
    }
}
