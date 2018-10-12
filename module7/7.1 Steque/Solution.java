

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
			System.out.println("Steque is empty.");

		} else {
			// System.out.println(ll.size());
			ll.remove(front + 1);
			// System.out.println(ll);
			String s = ll.toString();
			if (!(ll.isEmpty())) {
				System.out.println(s.substring(1, s.length() - 1));
			} else {
				System.out.println("Steque is empty.");
			}

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
		//sc.next();

		for (int i = 0; i < operations+1; i++) {
			
			do {

				String in = sc.nextLine().trim();
//				System.out.println(in.length());
				if(in.length()==0) {
					sq.ll.clear();
					System.out.println();
					break;
				}
				String inp[] = in.split(" ");
				switch (inp[0]) {
				case "push":
//					int y=sc.nextInt();
//					System.out.println(Integer.parseInt(inp[1]));
					sq.push(Integer.parseInt(inp[1]));
					break;

				case "enqueue":
					sq.enqueue(Integer.parseInt(inp[1]));
					break;

				case "pop":

					sq.pop();
					// sc.nextLine();
					break;

				}
				
			} while (sc.hasNext());
//			System.out.println("Ending ");

		}

		/*
		 * sq.push(1); sq.push(2); sq.push(3); sq.push(4); sq.enqueue(0); sq.enqueue(1);
		 * sq.pop(); sq.pop(); sq.pop(); sq.pop(); sq.pop(); sq.pop(); sq.pop();
		 * sq.pop();
		 */

	}

}
