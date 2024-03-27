package superclass;
class mentor
{
	mentor()//parent class
	{
		System.out.println("Parent Class Constructor");
	}

}

public class Super_exe1 extends mentor
{
	Super_exe1()
	{
		super();//2.super calling statement (always be in 
		//1st line of constructor)
		//it is mentonied so it is explicit even if it is not mentioned by
//default it is present  
		System.out.println("child class construtor");
	}
	public static void main(String[] args)
	{
		Super_exe1 s1=new Super_exe1();
	}

}

//1.super calling statement is used
//the parent class constructor from the child class constructor
//3.super calling statement will call in two ways (implicit and explicit)