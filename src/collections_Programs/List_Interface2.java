package collections_Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Interface2 {

	public static void main(String[] args) {

	//	List l1=new ArrayList();
		List<String> l1=new ArrayList<String>();

		l1.add("Java");
		l1.add("Python");
		l1.add("ruby");
		l1.add("C#");
		l1.add("TypeScript");
		
		System.out.println(l1);
		l1.get(0);
		System.out.println(l1);
		
		l1.set(0, null);
		l1.indexOf(l1);
		System.out.println(l1);
		
		l1.lastIndexOf(l1);
		System.out.println(l1);
		
		
	}

}
