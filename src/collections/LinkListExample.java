package collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Ram");
		list1.add("Don");
		list1.add("Con");
		list1.add("Jon");
		list1.addFirst("site");
		list1.addLast("lux");
		
		System.out.println(list1);
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}		

	}

}
