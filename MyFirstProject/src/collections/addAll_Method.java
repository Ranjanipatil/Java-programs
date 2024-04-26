package collections;

import java.util.ArrayList;

public class addAll_Method {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add("aa");
		a2.add("bb");
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);
		
	}

}
