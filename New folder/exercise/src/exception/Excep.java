package exception;

public class Excep {

	public static void main(String[] args) {
		try {
			int[] a=new int[4];
			a[52]=10;
			System.out.println("Result = "+a[52]);
		}
		catch(ArithmeticException e) {
			System.out.println("Result = "+e);
		}catch (Exception e2) {
			System.out.println("Result = "+e2);
		}
		finally {
			System.out.println("shakil");
		}
	}

}

	
