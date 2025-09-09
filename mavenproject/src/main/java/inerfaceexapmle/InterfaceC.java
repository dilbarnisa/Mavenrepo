package inerfaceexapmle;

public class InterfaceC implements InterfaceP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceP obj = new InterfaceC();
		obj.display();
		obj.print();
		

	}
	
	public void print() {
		System.out.println("hai");
	}
	
	public void display() {
		System.out.println("hello");
	}

}
