package collections_Programs;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {

	public static void main(String[] args) {

		Map<Integer,String> m1= new HashMap<Integer,String>();
		m1.put(785, "Ram");
		m1.put(786, "Pooja");
		m1.put(787, "Prasad");
		m1.put(788, "Manu");
		System.out.println(m1);
		
		Map<Integer,String> m2= new HashMap<Integer,String>();
		m2.put(7802, "Rama");//like add
		m2.put(7856, "Puja");
		m2.put(7821, "Trisha");
		m2.put(7889, "Manas");
		System.out.println(m2);
		
		boolean b1= m1.equals(m2);
		System.out.println(b1);
		
		m1.putAll(m2);//like add all
		m1.remove(785);
		System.out.println(m1);
		System.out.println(m2.containsKey(7889));
		System.out.println(m2.containsValue("Manas"));
		
		m2.replace(7889, "Suresh");
		System.out.println(m2);
		System.out.println(m2.size());
		System.out.println(m1.isEmpty());
		m2.clear();
		System.out.println("m2 is Empty now" + " "+ m2);
		
	}

}
