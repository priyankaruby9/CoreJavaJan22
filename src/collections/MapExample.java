package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "Suraj");
		map1.put(2, "Disha");
		map1.put(3, "kim");
		map1.put(10, "nil");
		
		map1.put(2, "jog");
		
		System.out.println(map1);
		map1.remove(10);
		System.out.println(map1);
		
		for(Map.Entry<Integer, String>entry1 : map1.entrySet()) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}
		
		for(Integer val : map1.keySet()) {
			System.out.println("key is" + val);
			System.out.println("value is" + map1.get(val));
		}
		
		for(String val : map1.values()) {
			System.out.println("values is" + val);
		}
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>(); 
		map2.put(1, "Suraj");
		map2.put(2, "Disha");
		map2.put(3, "kim");
		map2.put(10, "nil");
		
		System.out.println(map2);
		
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		map3.put(1, "Suraj");
		map3.put(2, "Disha");
		map3.put(3, "kim");
		map3.put(10, "nil");
		System.out.println(map3);
		
		//String str1 = "Clean India Green India Love India"  //key- word  value-occurance. we have to reverse map 
	}

}
