package mypacakage;

public class CallStaticMethodInside_MainMethod 
{
	
	static void add()
	{
	System.out.println("Addition");//it is not called in the main method so it will not come in output
	}

	public static void main(String[] args) 
{
		
		System.out.println("Main Method");//o/p will be this becoz it called inside the main method 
		add();//call this add method in main method then the o/p will be Main method and Addtion
		
		add();
		add();
	}

}
