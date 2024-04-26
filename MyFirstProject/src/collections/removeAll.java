package collections;

import java.util.ArrayList;

public class removeAll {

	public static void main(String[] args)
	
{
	
		ArrayList a1=new ArrayList();
		a1.add("aa");
		a1.add("bb");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add("aa");
		a2.add("bb");
		a2.add("cc");
		a2.removeAll(a1);
		System.out.println(a2);	
	}

}

