package superkeyword;

public class SuperMethodP {
	
	public void sing() {
		System.out.println("sings");
	}
	
	public void write() {
		System.out.println("writes");
		
		this.sing();
	}

}
