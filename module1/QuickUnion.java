package com.datastructures.quickfind;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class QuickUnion {
	private int[] id;

	public QuickUnion(int n) {

		id = new int[n];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	private int root(int i) {
		while (i != id[i]) {
			i = id[i];

		}
		return i;
	}

	public boolean find(int p, int q) {
		return root(p) == root(q);
	}

	public void unite(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		QuickUnion qu = new QuickUnion(n);
		qu.find(9, 0);
		qu.unite(9, 0);
		qu.find(3, 4);
		qu.unite(3, 4);
		qu.find(5, 8);

		qu.unite(5, 8);
		qu.find(7, 2);
		qu.unite(7, 2);
		qu.find(2, 1);
		qu.unite(2, 1);
		qu.find(5, 7);
		qu.unite(5, 7);
		qu.find(0, 3);
		qu.unite(0, 3);
		qu.find(4, 2);
		qu.unite(4, 2);

		for (int i = 0; i < n; i++) {
			System.out.print(qu.id[i]);
		}

	}
}
