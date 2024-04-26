package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_List 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("8765");
		a1.add("321");
		a1.add("Ranju");
		a1.add("sun");
		a1.add("moon");
		
		
	Iterator i1	= a1.iterator();//using Iterator we can use to printing the value in forward direction
	while(i1.hasNext()==true)
	{
		System.out.println(i1.next());
		
	}
	
	
	ListIterator i2=a1.listIterator();//is used to print the values in forword and backword direction 
	while(i2.hasNext()==true)
	{
		System.out.println("Forword iteratortion "+i2.next());
	}
	
	System.out.println("============****=============" );
	
	while(i2.hasPrevious()==true)
	{
		System.out.println("backword iteratortion "   +i2.previous());
	}
}
}
//Only previous or backword will not work without the forward iteration