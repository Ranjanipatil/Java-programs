//multi level inheritance
package inheritance;
class Grandparent_Class
{
	static void fetching_username()
	{
		System.out.println("fetching_username");
	}

}
class Parent_Class extends Grandparent_Class
{
	static void login_using_UN()
	{
		System.out.println("parent");
	}
	public class Child_Class1 extends Parent_Class
	{
		static void Adding_productto_cart()
		{
			System.out.println("child");
		}

		public static void main(String[] args) 
		{
			fetching_username();
			login_using_UN();
			Adding_productto_cart();
			

		}
	}
}
