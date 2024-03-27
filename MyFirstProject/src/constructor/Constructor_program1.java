 package constructor;

public class Constructor_program1 {
	
	Constructor_program1()//constructor
	{
	System.out.println("this is my constructor");	
	}
	public static void main(String[] args) //main method
	{
		System.out.println("main method");
		Constructor_program1 c1=new Constructor_program1();
		//1st syntax of creating an object
		new Constructor_program1();//2nd way of creating an object
	
	}

}
