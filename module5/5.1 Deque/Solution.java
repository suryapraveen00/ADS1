//package com.links.datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class LinkedQueue {

	int rear;
	int front;
	LinkedList<Integer> ll = new LinkedList<>();

	public LinkedQueue() {

		rear = 0;
		front = -1;
	}

	boolean enqueue(int x) {
		
		//String elements ="";
		ll.add(++rear, x);
		/*Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			elements+=itr.next();
			System.out.println("*"+elements);

		}*/
		System.out.println(ll);
		return true;

	}

	int dequeue() {

		ll.remove(front + 1);
		//rear--;

		//System.out.println("After removing from queue");
		/*Iterator itr = ll.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		System.out.println(ll);
		return 1;
	}

	int deleteEnd() {

		ll.remove(rear--);
		//System.out.println("deleting elements from the end of queue");
		//Iterator itr = ll.iterator();

		/*while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		System.out.println(ll);
		return 1;

	}
	
	int addFront(int z) {
		
		ll.add(front+1,z);
		//System.out.println("Adding elements at the front of  queue");
		/*Iterator itr = ll.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		System.out.println(ll);
		return 1;
		
	}
	
	
	
	

}

public class Solution {

	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		LinkedQueue q = new LinkedQueue();

 		int operations =sc.nextInt();
 		//sc.next();
 		for(int i=1;i<=operations;i++) {
 			//System.out.println("input - "+i);
 			switch(sc.next()) {
 			case "pushLeft"://q.enqueue(sc.nextInt());
 				q.addFront(sc.nextInt());
 			break;
 			
 			case "pushRight"://q.addFront(sc.nextInt());
 				q.enqueue(sc.nextInt());
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
