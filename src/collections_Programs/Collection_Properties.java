package collections_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Properties {

	public static void main(String[] args) {

		Collection <Double> c1= new ArrayList<Double>();//upcasting
		c1.add(45.0);
		c1.add(10.63);
		c1.add(11.0);
		
		System.out.println(c1);
		
		// methods of collection
		c1.addAll(c1);
		c1.contains(c1);
		c1.containsAll(c1);
		c1.equals(c1);
		c1.isEmpty();
		Iterator<Double> c2=c1.iterator();
		while(c2.hasNext()) {
			System.out.println(c2.hasNext());
		}
		c1.iterator();
		c1.remove(c1);
		c1.removeAll(c1);
		c1.size();
		c1.clear();
	}

}