package collections;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> fruit = new TreeSet<String>();
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("kiwi");
		fruit.add("strwberry");
		fruit.add("banana");
		fruit.add("Orange");
		System.out.println(fruit);
		
		Iterator <String> i = fruit.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		i.remove();
		System.out.println(fruit);
		
			
		
		

	}

}
