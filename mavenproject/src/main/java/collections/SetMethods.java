package collections;

import java.util.*;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> even = new TreeSet<Integer>();
		even.add(2);
		even.add(4);
		even.add(6);
		
		Set<Integer> odd = new TreeSet<Integer>();
		odd.add(1);
		odd.add(5);
		odd.add(3);
		
		System.out.println(even);
		System.out.println(odd);
		
		//1.addAll()
		even.addAll(odd);
		System.out.println(even);
		System.out.println(odd);
		
		//2.containsAll()
		System.out.println(even.containsAll(odd));
		System.out.println(odd.containsAll(even));
		
		//3.removeAll()
		System.out.println(even);
		even.removeAll(odd);
		System.out.println(even);
		
		
		
		
		
		
		
		
		
		

	}

}
