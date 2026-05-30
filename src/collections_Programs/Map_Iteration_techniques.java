package collections_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Iteration_techniques {

	public static void main(String[] args) {
		Map<String,Integer> m1= new HashMap<String,Integer>();
		m1.put("Maths", 94);
		m1.put("Sci", 95);
		m1.put("Eng", 99);
		m1.put("Hindi", 80);
		m1.put("Social S", 75);
        System.out.println(m1);

        System.out.println("Iterating all keys using KeySet");
	    for(String s1:m1.keySet()) //for each loop
	    	
	    {  
	    	System.out.println(s1);
	    }
	    
	    System.out.println("Iterating all Values using Values");
	    for(Integer i1:m1.values()) //for each loop
	    	
	    {  
	    	System.out.println(i1);
	    }
	    
	    System.out.println("Iterating all Key:Value pair using EntrySet");
	    for(Entry<String,Integer> s2:m1.entrySet()) //for each loop
	    	
	    {  
	    	System.out.println(s2);
	    }
	
	
	}

}
