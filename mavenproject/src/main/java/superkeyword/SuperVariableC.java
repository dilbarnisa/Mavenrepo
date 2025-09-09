package superkeyword;

public class SuperVariableC extends SuperVariableP{
	
	String color="balck";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperVariableC obj = new SuperVariableC();
		obj.print();

	}
	
	public void print() {
		System.out.println(color);
		System.out.println(super.color);
		
	}
	
	

}
