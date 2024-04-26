package collections;

import java.util.ArrayList;

public class contains {

	public static void main(String[] args) {
		ArrayList a2=new ArrayList();
		a2.add("aa");
		a2.add("bb");
		
		System.out.println(a2.contains("aa"));//true
		System.out.println(a2.contains(""));//false
	}

}
