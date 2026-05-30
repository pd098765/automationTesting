package collections_Programs;

public class Class_typeCasting {

	public static void main(String[] args) {
		Object o1= new Class_typeCasting(); //implicit upcasting
		Object o2= (Object) new Class_typeCasting(); //explicit upcasting
		
		//1st -  int into double
		int a=100;
		double d=a; //widening implicit
		System.out.println(d);
		
		double d1=(double)a;  //widening explicit
		System.out.println(d1);
		
		//2nd - double into int
		double x= 45.678;
		int x1=(int)x; // narrowing explicit
		System.out.println(x1);
		
	}

}
 