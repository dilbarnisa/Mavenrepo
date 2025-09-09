package inheritance;

public class HeirarchyC1 extends HeirarchyP{

	public static void main(String[] args) {
		
		HeirarchyC1 obj=new HeirarchyC1();
		obj.draw();
		obj.write();
				
	}
	
	public void write() {
		System.out.println("Child1 write");
	}

}
