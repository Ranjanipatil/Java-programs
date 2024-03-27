package Abstract_Class;
abstract class Facebook_class
{
	void add()//concreate method 1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void subtract()//concreate mrthod 2
	{
		System.out.println(Math.subtractExact(10,20));
	}

	abstract void multiple();//abstract method1
	abstract void divide();//abstract method2
}
public class Abstract_CM_AM extends Facebook_class
{
	void modulus()
	{
		System.out.println("modulus");
	}
	public static void main(String[] args) 
	{
		Abstract_CM_AM a1=new Abstract_CM_AM();
		a1.multiple();
		a1.divide();
		a1.modulus();
		subtract();
		a1.add();
	}
	void multiple() 
	{
		int a=10;
		int b=28;
		System.out.println(a+b);

	}
	void divide() 
	{
		System.out.println("divide");


	}
}