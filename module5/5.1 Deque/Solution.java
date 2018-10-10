

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Solution {

	int rear;
	int front;
	LinkedList<Integer> ll = new LinkedList<>();

	public Solution() {

		rear = -1;
		front = -1;
	}

	boolean enqueue(int x) {

		ll.add(++rear, x);
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		return true;

	}

	int dequeue() {

		ll.remove(front + 1);
		rear--;

		System.out.println("After removing from queue");
		Iterator itr = ll.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		return 1;
	}

	int deleteEnd() {

		ll.remove(rear--);
		System.out.println("deleting elements from the end of queue");
		Iterator itr = ll.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		return 1;

	}
	
	int addFront(int z) {
		
		ll.add(++front,z);
		System.out.println("Adding elements at the front of  queue");
		Iterator itr = ll.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		return 1;
		
	}
	
	
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		Solution q = new Solution();

 		int operations =sc.nextInt();
 		
 		for(int i=1;i<=operations;i++) {
 			switch(sc.next()) {
 			case "pushLeft":q.addFront(sc.nextInt());
 			break;
 			
 			case "pushRight":q.enqueue(sc.nextInt());
 			break;
 			
 			case "popLeft":	q.dequeue();
 			break;
 			
 			case "popRight":q.deleteEnd();
 			break;
 			
 			case "isEmpty":System.out.println(q.ll.isEmpty());
 			break;
 			
 			case "size":System.out.println(q.ll.size());
 			break;

 			}
 		}
 		
		//LinkedQueue q = new LinkedQueue();
		/*q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println("-------");
		q.enqueue(30);
		q.enqueue(40);
		q.deleteEnd();
		q.addFront(60);*/

	}
	

}


