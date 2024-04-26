package collections;

import java.util.ArrayList;

public class containsAll {
	public static void main(String[] args) 
	{
		
	ArrayList  a1=new ArrayList();
	a1.add(100);
	a1.add(200);
	a1.add(300);
	
	ArrayList a2=new ArrayList();
	a2.add(100);//true
	a2.add(200);//true
//a2.add(400);//false
  	System.out.println(a1.containsAll(a2));
		
	}

}
