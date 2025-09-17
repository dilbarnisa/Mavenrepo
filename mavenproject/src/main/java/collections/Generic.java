package collections;

import java.util.*;

public class Generic {

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
		
		List<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		
		System.out.println(number);
		

	}

}
