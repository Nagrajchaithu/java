package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map12 {

	public static void main(String[] args) {
		Map <Integer ,String> hm1 = new HashMap<>();
		System.out.println("*********  Hashmap   **********");
		hm1.put(1, "nagaraj");
		hm1.put(2, "veda");
		hm1.put(5, "kamal");
		hm1.put(4, "vidya");
		System.out.println(hm1);
		hm1.put(0, "sandya");
		System.out.println(hm1);
		hm1.remove(5);
		System.out.println(hm1);
		
		System.out.println("*******   Linked Hashmap  **********");
		Map<Integer,String> lm1=new LinkedHashMap<Integer,String>();
		
		lm1.put(66, "prasad");
		lm1.put(22, "shankar");
		lm1.put(9, "Jittu");
		lm1.put(7, "srinu");
		System.out.println(lm1);
		lm1.remove(7);
		System.out.println(lm1);
		System.out.println("********   Tree map   *******");
		Map <String ,Integer> tm1= new TreeMap<String,Integer>();
		
		tm1.put("Ravali", 0);
		tm1.put("Jyothi", 2);
		tm1.put("Anitha", 3);
		tm1.put("Banu", 77);
		System.out.println(tm1);
		tm1.remove("Banu");
		System.out.println(tm1);
		
		
		
	
		
	}

}
