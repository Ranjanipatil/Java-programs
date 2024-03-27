package superclass;
class parent 
{
	parent(int a)//parent constructor
	{
		System.out.println("parent class constrouctor");
	}
	}
public class Super_calling_statement extends parent 
{
	Super_calling_statement()//child constructor
	{
	super(10);//super calling statement
	{
		System.out.println("Child Class Construtor");
	}
	}
	public static void main(String[] args) 
	{
		
		Super_calling_statement s1=new Super_calling_statement();
		//object of child
	}
}

//------Execution will be -----
	//create an object of child class then then it will go the child class and constructor 
	//in child class then call super calling statement to invoke the sysout in the parent class and then invoke 
	//the sysout in child class

//parent(int a)----parameterized 
//super()----non parameterized
	//so out put will be -----CTE
//super calling statement are two types one is parameterized and 
//super calling statement are two types  
//non parameterized supper calling statement calls in two 
//and non parameterized ----can be return in two ways
//implicitly and explicitly
//Parameterized -----explicitly