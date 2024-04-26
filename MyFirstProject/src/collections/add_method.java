package collections;

import java.util.ArrayList;

import java.util.Collections;


public class add_method {

	public static void main(String[] args) 
	{

    ArrayList a1=new ArrayList();
    a1.add(100);
    a1.add(200);
    a1.add(300);
    //a1.add("Ranjani");
   // a1.add(true);
   // a1.add(0.765);
   // a1.add('p');
   // a1.add(100);
   //a1.add(200);
    //a1.add(300);
    //a1.add("Ranjani");
    //a1.add(true);
    //a1.add(0.765);
   // a1.add('p');
    //a1.add(null);
    a1.add(811);
    Collections.sort(a1);
	System.out.println(a1);
	Collections.sort(a1,Collections.reverseOrder());
	System.out.println(a1);
    

	ArrayList a2=new ArrayList();
		a2.add(876);
		a2.add(811); 
		a2.add(123);
		a2.add(1);
		a2.add(90);
		a2.add(-90);
		a2.add(811);
		a2.add(811);
		a2.add(0);
		Collections.sort(a2);
		System.out.println(a2);
		Collections.sort(a2,Collections.reverseOrder());
		System.out.println(a2);
		
	}
}

//It accepts duplicate value too
//It is dynamic meaning keep on increasing the size (11 to25)
//It accepts heterogeneous 
//It follows indexing(values are stored in order)
//sorting can be done by using collections(class).sort(method)
//accepts any number of Null Values


//For reverse order the null will not work 


