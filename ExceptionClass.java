package w3resource;

public class ExceptionClass {
	public static void main(String[] args) {
		
		try {
			String s="123";
			int [] array=new int[5];
			System.out.println(Integer.parseInt(s));
			System.out.println(10/5);
			System.out.println(array[16]);
		}
		catch(NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("Sorry !! Number format");
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Sorry !! Arithmetic Exception");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Unexpected Exception happend");
		}
		
		finally {
			System.out.println("I am finally block");
		}
		
		
	}
}
