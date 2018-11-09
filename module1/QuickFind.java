package com.datastructures.quickfind;

import java.util.Scanner;



public class QuickFind {
	
	private int[] id;
	
	public QuickFind(int n) {
		id=new int[n];
		for(int i=0;i<id.length;i++) {
			id[i]=i;
		}
		
		
	}
	
	public void union(int id1,int id2) {
		int id_1 = id[id1];
		int id_2=id[id2];
		
		for(int i=0;i<id.length;i++) {
			if(id[i]==id_1) {
				id[i]=id_2;
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		QuickFind qf = new QuickFind(n);
		qf.union(9,0);
		
		qf.union(3,4);
		qf.union(5, 8);
		qf.union(7, 2);
		qf.union(2,1);
		qf.union(5,7);
		qf.union(0, 3);
		qf.union(4, 2);
		for(int i=0;i<n;i++) {
			System.out.print(qf.id[i]+"\t");
		}
	
		
		
	}
	
	
	
	 }
