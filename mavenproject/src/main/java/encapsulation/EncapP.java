package encapsulation;

public class EncapP {
	
	private int age ;// private instance variable
	private String name ; //private instance variable
	
	
	void set (int age , String name){
		
		this.age=age;
		this.name= name;
		
		}
	
	void get () {
		System.out.println(age + " "+ name);
	}
	
	
	

}
