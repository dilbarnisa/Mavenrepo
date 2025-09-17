package collections;


import java.util.*;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List color = new LinkedList();
		
		color.add("Red");
		color.add(19);
		color.add(2.3f);
		color.add("Red");
		System.out.println(color);
		
		Set fruit = new HashSet();  //TreeSet will not work in non generic
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add(4);
		fruit.add(5);
		fruit.add(3);
		fruit.add(2.4f);
		fruit.add('D');
		fruit.add('f');
		fruit.add('s');
		
		System.out.println(fruit);
		

	}
	
	

}
