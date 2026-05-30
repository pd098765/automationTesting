package collections_Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Interface {

	public static void main(String[] args) {

	//	List l1=new ArrayList();
		List<String> l1= new ArrayList<String>();

		l1.add("Java");
		l1.add("Python");
		l1.add("ruby");
		l1.add("C#");
		l1.add("TypeScript");
		
		System.out.println(l1);
		
		Iterator<String> l2=l1.iterator();
		
		while(l2.hasNext()) 
		{
			System.out.println(l2.next());
		}
		System.out.println("******************");
	
		
		//List-indexing
		//maintain the order of the insertion
		//accepts duplicate,null-unknown value yet
		
	}

}
