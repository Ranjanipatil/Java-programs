package superclass;
class Grand_Parent
{
	Grand_Parent()
	{
		System.out.println("1");
	}
}
class Parent extends Grand_Parent
{
	Parent()
	{
		System.out.println("2");
	}
}
public class Default_Supercallingexe2 extends Parent
//child class having
//default super calling statement or we can call explicitly 
{
	Default_Supercallingexe2()
	{
		super();
		System.out.println("3");
		
	}
public class myclass
{
myclass()
{

	System.out.println("4");
}
}
public static void main(String[] args)
{
	Default_Supercallingexe2 s1=new Default_Supercallingexe2();
	
}

}



