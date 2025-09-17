package exceptionhandle;

public class Example3 {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Example3 obj = new Example3();
			try {
			obj.checkAge(17);
			}
			
			catch(ArithmeticException e) {
				System.out.println("exception "+ e.getMessage());
			}
			

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



