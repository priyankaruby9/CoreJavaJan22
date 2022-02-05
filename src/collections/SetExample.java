package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {   // Set contains only unique elements.no repeated elements
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>(); // set stores data is stored in random order
		
		set1.add("name1");
		set1.add("name2");
		set1.add("name3");
		set1.add("name4");
		set1.add("name5");
		set1.add(null);
		set1.add(null);
		System.out.println(set1);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>(); // always maintain the order of data
		
		set2.add("name1");
		set2.add("name2");
		set2.add("name3");
		set2.add("name4");
		set2.add("name5");
		set2.add(null);
		System.out.println(set2);
		
		
		TreeSet<String> set3 = new TreeSet<String>(); // data is stored in ascending order
		
		set3.add("name1");
		set3.add("name2");
		set3.add("name3");
		set3.add("name4");
		set3.add("name5");
		//set3.add(null); //cannot add null value to tree set
		System.out.println(set3);
		
	}

}
