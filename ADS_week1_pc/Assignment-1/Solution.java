
import java.util.Scanner;

import java.io.*;
import java.util.*;


class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
		LinkedList<Integer> ll = new LinkedList<>();
		int number1 = Integer.parseInt(number);
		while (number1 > 0) {
		    //System.out.println( "*"+number1% 10);
		    ll.add(number1%10);
		    number1 = number1 / 10;
		   
		}

		
		Iterator<Integer> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//digitsToNumber(ll);
		return ll;
    }

    public static String digitsToNumber(LinkedList list) {
    	
    	String num1 ="";
    	Iterator<Integer> itr = list.iterator();
    	while(itr.hasNext()) {
			num1+=itr.next();
		}
    	
    	
		return num1;

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    
    	LinkedList<Integer> results = new LinkedList<>();
    	
    	String result1="";
    	String result2="";
    	
    	Iterator<Integer> itr1 = list1.iterator();
    	while(itr1.hasNext()) {
    		result1+=itr1.next();
    	}
    	
    	Iterator<Integer> itr2=list2.iterator();
    	while(itr2.hasNext()) {
    		result2 +=itr2.next();
    	}
    	
    	int numbr1 = Integer.parseInt(result1);
    	int numbr2 = Integer.parseInt(result2);
    	
    	int sum =numbr1+numbr2;
    	results.add(sum);
    	
    	
    	return results;
    	
    	
    		
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
               LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
