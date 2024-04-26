package collections;

import java.util.LinkedList;

public class Linked_List {
	
	public static void main(String[] args)
	{
		
LinkedList<Integer> l1=new LinkedList();
	
l1.add(12);
l1.add(21);
l1.add(321);
l1.add(22);
System.out.println(l1.getFirst());
System.out.println(l1.getLast());
System.out.println(l1.peekFirst());
System.out.println(l1.peekLast());
System.out.println(l1.offerFirst(678));
System.out.println(l1.offerLast(111121));
System.out.println(l1.removeFirst());
//System.err.println(l1.removeLast());
}
}