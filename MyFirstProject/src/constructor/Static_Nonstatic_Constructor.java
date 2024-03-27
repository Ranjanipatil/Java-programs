package constructor;

public class Static_Nonstatic_Constructor {
	public static void add()
	{
	int a=10;
	int b=23;
	int c=a+b;
	System.out.println(c);
	}
	void sub()
	{
		int a=50;
		int b=25;
		int c=a-b;
		System.out.println(c);
	}
	Static_Nonstatic_Constructor()
	{
		System.out.println("this is my constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		
		add();
		Static_Nonstatic_Constructor c1=new Static_Nonstatic_Constructor();
		new Static_Nonstatic_Constructor();
		c1.sub();
		
	}

}
