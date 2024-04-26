package collections;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Iterator_Set {

	public static void main(String[] args) {

		Set s1=new TreeSet();
		s1.add(1234);
		s1.add(756);
		s1.add(9876);
		s1.add(22);//set does't follow insertion order 
		s1.add(45);//set is not index based data it stores the data according to hashcode values
		s1.add(1234);
		s1.add(1234);//set does not allow to stores duplicate elements
		//s1.add(null);//set can store only one null value in it 

		System.out.println(s1);

		Iterator i1=s1.iterator();//interface is always (I-capital leetters)and methods always in small letters(i)
		while (i1.hasNext()==true);
		System.out.println(i1.next());
		
		
	}
}