package NESTED_IF_Condition;

public class LogicalOperatorOR {

	public static void main(String[] args) 
	{
		int age=18;
		int salary=15000;
		if (age>100||salary==15000)
		{
			System.out.println("true");

		}
		
		else if(age>18||salary==15000)
		{
			System.out.println("false");
		}
	}


}
