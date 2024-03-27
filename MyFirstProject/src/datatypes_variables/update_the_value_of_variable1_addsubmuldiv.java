package datatypes_variables;

public class update_the_value_of_variable1_addsubmuldiv {

//calling 4 static methods so inside main we should call only name of the methods 
	public static void add()
	{
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);
	}
	public static void sub()
	{
		int a=40;
		int b=30;
		int sub=a-b;
		System.out.println(sub);
	}
	public static void mul()
	{
		int a=12;
		int b=10;
		int mul=a*b;
		System.out.println(mul);
	}
	public static void div()

	{
		int a=10;
		int b=40;
		int div=b/a;
		System.out.println(div);
	}
	
			public static void main(String[] args) {

add();
mul();
div();
sub();

	}

}
