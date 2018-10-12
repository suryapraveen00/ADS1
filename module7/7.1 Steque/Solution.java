

import java.util.LinkedList;
import java.util.Scanner;

class StackQueue {

	int top;
	int rear;
	int front;
	LinkedList<Integer> ll = new LinkedList<>();

	public StackQueue() {
		top = -1;
		rear = 0;
		front = -1;
	}

	boolean push(int x) {

		ll.add(top + 1, x);
		// System.out.println(ll);
		String s = ll.toString();
		System.out.println(s.substring(1, s.length() - 1));

		return false;

	}

	boolean enqueue(int x) {

		rear = ll.size();
		ll.add(rear++, x);
		// System.out.println(ll);
		String s = ll.toString();
		System.out.println(s.substring(1, s.length() - 1));

		return false;

	}

	int pop() {
		Scanner sc = new Scanner(System.in);

		if (ll.isEmpty()) {
			// sc.nextLine();
			System.out.println("Steque is empty");

		} else {
			ll.remove(front + 1);
			// System.out.println(ll);
			String s = ll.toString();
			System.out.println(s.substring(1, s.length() - 1));

		}
		return 1;

	}
}

public class Solution {

	public static void main(String[] args) {
		StackQueue sq = new StackQueue();
		Scanner sc = new Scanner(System.in);
		int operations = sc.nextInt();
		// sc.next();

		// System.out.println("input - "+i);
		 sc.next();
		while (operations >= 1) {
			switch (sc.next()) {
			case "push":
				sq.push(sc.nextInt());

				break;

			case "enqueue":
				sq.enqueue(sc.nextInt());
				break;

			case "pop":

				sq.pop();
				break;

			}
			
		


		}

		
		/*
		 * sq.push(1); sq.push(2); sq.push(3); sq.push(4); sq.enqueue(0); sq.enqueue(1);
		 * sq.pop(); sq.pop(); sq.pop(); sq.pop(); sq.pop(); sq.pop(); sq.pop();
		 * sq.pop();
		 */
	}

}
