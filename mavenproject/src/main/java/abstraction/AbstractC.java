package abstraction;

public class AbstractC extends AbstractP{

	public static void main(String[] args) {
		// TODO Auto-generated method 

		//AbstractC obj = new AbstractC();   or
		
		AbstractP obj = new AbstractC();
		obj.print();
		obj.display();
				

	}
	
	public void print() {
		System.out.println("hello");
	}

}
