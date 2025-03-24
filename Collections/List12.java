package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List12 {

	public static void main(String[] args) {
		List <Integer> list1 = new ArrayList<Integer> ();
       list1.add(12);
       list1.add(11);
       list1.add(1);
       list1.add(18);
       System.out.println("********   Arraylist   *********");
       System.out.println(list1);
       list1.remove(0);
       System.out.println(list1);
     System.out.println("**********  Linkedlist  ******************");
     List <Integer> list2 = new LinkedList<Integer>();
     list2.addAll(list1);
     list2.add(100);
     list2.add(70);
     list2.add(19);
     list2.remove(3);
     System.out.println(list2);
	}

}
  