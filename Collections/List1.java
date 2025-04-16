package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class List1 {

	public static void main(String[] args) {
		List <Integer> mm= new ArrayList<> ();
		Set <Integer> ss = new HashSet <>();
		Map<Integer,String> aa= new HashMap<>();
		mm.add(10);
		mm.add(11);
		ss.add(100);
		ss.add(90);
		aa.put(1, "nagaraju");
		aa.put(2, "harikrishna");
		System.out.println(mm);
		System.out.println(ss);
		System.out.println(aa);
		mm.remove(0);
		System.out.println(mm);
		ss.remove(100);
		System.out.println(ss);
		aa.remove(1);
		System.out.println(aa);
	
		

	}

}
