package collections_Programs;

public class Primitive_typecasting {

	public static void main(String[] args) {

//1st -  int into double
		int a=10;
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
