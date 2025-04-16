package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set12 {

	public static void main(String[] args) {
		Set <Integer> hs1=new HashSet<Integer>();
		System.out.println("******    Hashset   ******");
		hs1.add(12);
		hs1.add(13);
		hs1.add(123);
		hs1.add(3);
	
		System.out.println(hs1);
		hs1.remove(13);
		System.out.println(hs1);
		Set<Integer> lhs=new LinkedHashSet<Integer>();
		System.out.println("********    Liked hash set   *********** ");
		lhs.add(123);
		lhs.add(99);
		lhs.add(111);
		System.out.println(lhs);
		lhs.remove(99);
		System.out.println(lhs);
		Set<String>hm1= new TreeSet<String>();
		System.out.println("*********  Tree set****");
		hm1.add("varada");
		hm1.add("salar");
		hm1.add("bahubali");
		System.out.println(hm1);
		hm1.remove("bahubali");
		System.out.println(hm1);
		
				
		

	}

}
