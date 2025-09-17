package collections;

import java.util.*;

public class ListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> fruit = new ArrayList<String>();
		//add()
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("kiwi");
		fruit.add("strwberry");
		fruit.add("banana");
		fruit.add("Orange");
		System.out.println(fruit);
		
		
		//2.get()
		System.out.println("\n"+fruit.get(3));
		
		//3.set()
		fruit.set(2, "grape");
		System.out.println(fruit);
		
		//4.indexOf()
		System.out.println(fruit.indexOf("Orange"));
		
		
		//5.lastIndexOf()
		System.out.println(fruit.lastIndexOf("Orange"));
		
		//6.remove
		fruit.remove(5);
		System.out.println(fruit);
		
		//7.contains
		System.out.println(fruit.contains("Berry"));
		System.out.println(fruit.contains("grape"));
		
		//8.isEmpty
		System.out.println(fruit.isEmpty());
		
		//9.size
		System.out.println(fruit.size());
		


		}

}
