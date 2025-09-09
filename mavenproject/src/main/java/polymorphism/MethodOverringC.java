package polymorphism;

public class MethodOverringC extends MethodOverriding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverringC obj = new MethodOverringC();
		obj.sound();
		obj.start();
		
		
		}
		
		public void sound() {
			System.out.println("cat");
			super.sound();

	}
		
		public void start() {
			System.out.println("bike");
			super.start();
		}

}
