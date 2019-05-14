import java.util.*;
public class ArrayTest {
    private ArrayList al;
    
    public ArrayTest() {
        al = new ArrayList();
    }
    public void addItems(Object first, Object second) {
        synchronized(al) {
            al.add(first);
            al.add(second);
        }
    }
    
    public Object get(int index) {
        synchronized(al) {
            return al.get(index);
        }
    }
}