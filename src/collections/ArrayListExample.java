package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		arraylist1.add("Raj");
		arraylist1.add("Priya");
		arraylist1.add("Sona");
		arraylist1.add("Mol");
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		
		System.out.println(arraylist1);
		
		System.out.println("The element at 0 index is " + arraylist1.get(0));
		arraylist1.remove(0);
		arraylist1.set(1, "Ram"); //used to replace the element
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		
		System.out.println(arraylist1);
		
		for(int i = 0; i < arraylist1.size(); i++) {
			System.out.println(arraylist1.get(i));
		}
		
		for (String name: arraylist1) {
			System.out.println(name);
		}
		
		Iterator<String> itr = arraylist1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(arraylist1); // used to sort the arraylist.it alws sort in ascending order
		System.out.println(arraylist1);
		
		Collections.reverse(arraylist1); // used to sort in descending order
		System.out.println(arraylist1);
	}

}
