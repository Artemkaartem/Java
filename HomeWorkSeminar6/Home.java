package HomeWorkSeminar6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Home {
    
    public static void main(String[] args) {
        
        MySet<Integer> numbers = new MySet<>();

        for (int i = 0; i < 100; i++) {
            numbers.addNum(new Random().nextInt(100));
        }

        Iterator <Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            int a = iter.next();
            if (a % 2 == 0){
                System.out.println(a);
            }
        }
        System.out.println(numbers);
    }
}

class MySet<T> {

    private HashMap<T, Object> myMap = new HashMap<>();
    private static final Object OBJECT = new Object();

    public void addNum(T i) {

        myMap.put(i, OBJECT);

    }

    public boolean remove(T i) {

        return myMap.remove(i) == OBJECT;
    }

    public boolean contains(T i) {

        return myMap.containsKey(i);
    }

    public String toString() {

        StringBuilder str = new StringBuilder("[");
        Iterator<T> iter = myMap.keySet().iterator();

        while (iter.hasNext()){
            str.append(iter.next() + ",");
        }
        str.append("]");

        return str.toString();
    }

    public Iterator <T> iterator(){
        return myMap.keySet().iterator();
    }  
}
 