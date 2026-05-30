package collections_Programs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class List_into_Set 
{
	public static void main(String[] args) 
	{
		List l1=	new ArrayList();//List into set will remove all duplicates from given collection
		l1.add(100);
		l1.add(200);
		l1.add(4);
		l1.add(100);
		l1.add(63);
		System.out.println(l1);
		
		Set s1=new HashSet(l1);
		System.out.println(s1);

	}
}
	