package superkeyword;

public class SuperConstructorP {
	
	
	SuperConstructorP (){
		System.out.println("parent constructor");
	}
	
	SuperConstructorP (int a){
		
		this();
		System.out.println(a);
	}
}
