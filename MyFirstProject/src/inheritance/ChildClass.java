package inheritance;
//static methods and non static methods
//no constructor
class ParentClass
{
	static void parent()
	{
		System.out.println("Hey i am your parent class");
	}
	public class ChildClass extends ParentClass
	{
		static void child()
		{
			System.out.println("Hey i am child class");
		}
		public static void main(String[] args)
		{
			child();
			parent();
			
		}

	}
}
