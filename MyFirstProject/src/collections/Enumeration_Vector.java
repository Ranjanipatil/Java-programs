//Out of so many Lagacy Class in (Vector,stack ect)iterate using Enumeration??
//Enumeration e=v.elements();


package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration_Vector {
	public static void main(String[] args) 
	{
		
		Vector v =new Vector();
		v.add(10);
		v.add("ranjani");
		v.add(15);
		v.add('p');
		v.add(null);
		v.add(12);
		
		/*Enumeration e =v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());*/
	//	}
		
		/*Iterator i1= v.iterator();//using Iterator we can use to printing the value in forward direction
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
			
		}*/
		
		ListIterator i2=v.listIterator();//is used to print the values in forword and backword direction 
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


//v.addd(true);will not for vector 