package collections;


import java.util.Set;
import java.util.TreeSet;

public class Set_interface_TreeSet {

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


	}

}
