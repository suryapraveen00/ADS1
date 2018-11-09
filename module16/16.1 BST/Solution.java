import java.util.Scanner;

class Book
{
	String Name,Author;
	double price;
	public Book(String Name,String Author,double price)
	{
		this.Author=Author;
		this.Name=Name;
		this.price=price;
	}
}
class Node6
{
	public Book key;
	public int value;
	public Node6 left,right;
	public Node6(Book key,int value)
	{
		this.key=key;
		this.value=value;
	}
}
class BST
{
	Node6 root ;
	public void put(Book key, int value)
	{
		root = put(root,key,value);
	}
	private Node6 put (Node6 x, Book key, int value)
	{
		if(x==null)
		{
			return new Node6(key,value);
		}
		if(key.Name.compareTo(x.key.Name)<0)
		{
			x.left=put(x.left,key,value);
		}
		else if(key.Name.compareTo(x.key.Name)>0)
		{
			x.right=put(x.right,key,value);
		}
		else
		{
			x.value=value;
		}
		return x;
	}
	public int get(Book key)
	{
		Node6 x =root;
		while(x!=null)
		{
			if(key.Name.compareTo(x.key.Name)<0)
			{
				x=x.left;
			}
			else if(key.Name.compareTo(x.key.Name)>0)
			{
				x=x.right;
			}
			else
			{
				return x.value;
			}
		}
		return 0;
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST bst = new BST();
		while(sc.hasNext())
		{
			String line = sc.nextLine();
			String [] array = line.split(",");
			String Operation = array[0];
			Book book = new Book(array[1],array[2],Double.parseDouble(array[3]));
			switch (Operation)
			{
			case "put" :
				bst.put(book,Integer.parseInt(array[4]));
				break;
			case "get" :
				if(bst.get(book)!=0)
					System.out.println(bst.get(book));
				else
					System.out.println("null");
				break;
			}
		}
	}

}
