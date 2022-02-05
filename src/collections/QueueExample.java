package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>(); // never maintains the order of queue
		
		pq1.add("Nik");
		pq1.add("mathew");
		pq1.add("lisa");
		
		System.out.println(pq1);
		System.out.println("The first element" + pq1.peek());
		System.out.println("The last element " + pq1.poll());
		System.out.println(pq1);
		
		ArrayDeque<String> dq2 = new ArrayDeque<String>(); // maintain the order of queue
		
		dq2.add("Nik");
		dq2.add("mathew");
		dq2.add("lisa");
		
		System.out.println(dq2);
		System.out.println("The first element" + dq2.peek());
		System.out.println("The last element " + dq2.peekFirst());
		System.out.println("The last element " + dq2.peekLast());
		System.out.println(dq2.poll());
		//System.out.println(dq2.pollFirst());
		//System.out.println(dq2.pollLast());
		System.out.println(dq2);

	}

}
