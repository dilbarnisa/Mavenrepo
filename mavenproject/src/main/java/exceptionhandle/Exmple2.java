package exceptionhandle;

public class Exmple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exmple2 obj = new Exmple2();
		obj.checkAge(17);
		

	}
	
	public void checkAge(int age) throws ArithmeticException {
		
		if(age <18) {
			throw new ArithmeticException("access denied");
		}
		
		else {
			System.out.println("not eligible");
		}
	}

}
