package inerfaceexapmle;

public class InterfaceC1 implements InterfaceP1,InterfaceP2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceC1 obj = new InterfaceC1();
		obj.dance();
		obj.sing();

	}
	
	public void dance(){
		System.out.println("P1 dance");
	}
	
	public void sing(){
		System.out.println("P2 sing ");
	}
	
	

}
