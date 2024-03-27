package mypacakage;

public class CallNon_StaticMethodInside_MainMethod 
{

	void sub()
	{
		System.out.println("sub");
	}
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{

		System.out.println("div");
	}
	void add()
	{
		System.out.println("add");
	}
	public static void main(String[] args) {

		CallNon_StaticMethodInside_MainMethod S1=new CallNon_StaticMethodInside_MainMethod();


		S1.sub();
		S1.mul();
		S1.div();
		S1.add();

	}
}
