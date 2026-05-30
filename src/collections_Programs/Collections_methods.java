package collections_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_methods {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(80);
		a1.add(100);
		a1.add(50);
		a1.add(60);
		a1.add(55);
		
		
		Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		System.out.println(Collections.frequency(a1, 100));
		System.out.println(Collections.binarySearch(a1, 100));

		a1.addAll(a1);
		System.out.println(a1);
	}

}
