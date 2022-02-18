package try_catch;
//an exception is an event which occurs duringg the execution
//a program that disrupts the normal flow of the program instructions.



public class Demo {

	public static void main(String[] args) {
		
		int b[] = new int [2];
		
		try {
			System.out.println("value of b= " + b[3]);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		System.out.println(".............................");

	}

}
