package exo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fibonacci implements Iterable<Integer>{

	private final int borne;

    public Fibonacci(int borne) {
        this.borne = borne;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FiboIterator(borne);
    }

    public static void main(String[] args) {
    	List<Integer> tab = new ArrayList<Integer>();
    	tab.add(1);
    	tab.add(2);
    	tab.add(3);
    	
        for (Integer x : tab) {
            System.out.println(x);
        }
        
        for (int i = 0; i < tab.size(); i++) {
        	System.out.println(tab.get(i));
        }
        
        Iterator<Integer> it = tab.iterator();
        
        while (it.hasNext()) {
        	System.out.println(it.next());
        }
        
        ////////////////////////////////////////
        
        for (int i = tab.size(); i >= 0; i--) {
        	System.out.println(tab.get(i));
        }
        
        ///////////////////////////////////////
        
        for (Integer x : tab)
        	if (x%2 == 0) System.out.println(x);
        
        for (int i = 0; i < tab.size(); i++) {
        	if (i%2 == 0) System.out.println(tab.get(i));
        } 
    }
}