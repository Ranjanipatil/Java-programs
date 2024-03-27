package nonstatic_and_static_method;

public class Static_method_addition {


	public static void add(int a,int b)//parameterzied   static method
	{
	int c=a+b;
	System.out.println(c);
		
	}
	public static void sub()//non para static method
	{
		int a=63;
		int b=34;
		int sum=a-b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		add(10,20);
		sub();
		
		
		
	}


	}


