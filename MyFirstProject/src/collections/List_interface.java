package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class List_interface {

	public static void main(String[] args) {

		List s1=new ArrayList();
		s1.add(1234);
		s1.add(1,0);
		s1.add(-756);
		s1.add(9876);
		s1.add(22);//follow insertion order /sorted too
		s1.add(45);//index based data it stores the data according to index values
		s1.add(1234);//it is dynamic in nature
		s1.add(1234);//allow to stores duplicate elements 
		//s1.add(null);//many null value in it 
		//s1.add(null);
		//s1.add(null);*/accepts heterogeneous 
		Collections.sort(s1);//if you add sorting the null values will not be displayed 
		System.out.println(s1);

	}

}
