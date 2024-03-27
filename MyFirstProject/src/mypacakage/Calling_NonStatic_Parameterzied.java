package mypacakage;

public class Calling_NonStatic_Parameterzied {
	void  add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);

	}
	public static void main(String[] args) {

		Calling_NonStatic_Parameterzied C1=new Calling_NonStatic_Parameterzied();

		C1.add(20, 10);
	}
}
  