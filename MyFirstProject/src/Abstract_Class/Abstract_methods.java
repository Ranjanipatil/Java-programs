package Abstract_Class;
abstract class Google_Code
{
	abstract void login();
	abstract void registaration();
}
public class Abstract_methods extends Google_Code
{
	public static void main(String[] args) 
	{
		Abstract_methods a1=new Abstract_methods();
		a1.login();
		a1.registaration();
	}
	@Override
	void login()
	{
		System.out.println("login");
	}

	@Override
	void registaration() 

	{
		System.out.println("Registaration login");
	}
}
//method override is developing the methods in the parent class with the same name and 
//Signature as in the child class with different implimentaion  