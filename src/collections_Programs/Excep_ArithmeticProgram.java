package collections_Programs;

public class Excep_ArithmeticProgram {

	public static void main(String[] args) {

		try {
			int a = 1 / 0; // if 1/0 ArithmeticException is occured
			System.out.println(a);
			
		} catch (ArithmeticException a1) 
		{
			System.out.println("Exception is handled");
		} finally 
		{
			System.out.println("I will execute always");
		}
	}
}
