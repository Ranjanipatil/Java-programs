//Single Level inheritance 
package inheritance;
class State_Class//parent calss
{
	static void multiple()
	{
System.out.println("multiply");
	}
	void Division()
	{
		System.out.println("division");
	}
}
public class City_Class extends State_Class
//child class
{
	static void add()
	{
		System.out.println("adding");
	}
	void subtracting()
	{
		System.out.println("substarcting");
	}
	public static void main(String[] args) {
		add();
		multiple();
		City_Class c1=new City_Class();
		c1.subtracting();
		c1.Division();
	}

}
