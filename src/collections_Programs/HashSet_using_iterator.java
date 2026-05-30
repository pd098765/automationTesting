package collections_Programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_using_iterator {

	public static void main(String[] args) {
				HashSet<String> h1=new HashSet<String>();
				h1.add("Aa");
				h1.add("Bb");
				h1.add("Cc");
				h1.add("Dd");
				h1.add("Ee");
				
				Iterator<String> i1=	h1.iterator();
				while(i1.hasNext())
				{
					System.out.println(i1.next());
				}
					
			}					
	}

