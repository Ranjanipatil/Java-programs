package global_local_variables;

public class Global_Variable_Pgm2 
{
	static int a=20;// Variable declared globally once to perform 
	//all arithmetic operations and call inside the main method 
	static int b=30;
	int c=12;
	int d=4;
	static void add()
	{
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println(a-b);
	}
	static void mul()
	{
		System.out.println(a*b);
	}
	 void div()
	 {
		 
		 System.out.println(c/d);
		 
	 }
	public static void main(String[] args) {
		add();
		sub();
		mul();
		
		Global_Variable_Pgm2 d1=new Global_Variable_Pgm2();
		d1.div();

	}

}
