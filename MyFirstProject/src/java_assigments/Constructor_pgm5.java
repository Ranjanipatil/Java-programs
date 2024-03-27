//Create 5 constructor and call it in main method
package java_assigments;
public class Constructor_pgm5{
	Constructor_pgm5()
	{
		System.out.println("my 1st Constructor");
	}
	Constructor_pgm5(int a,int b)
	{
		System.out.println("my 2nd Constructor");
	}
	Constructor_pgm5(int a)
	{
		System.out.println("my 3rd Constructor");
	}
	Constructor_pgm5(double f)
	{
    System.out.println("my 4th constructor");
	}
	Constructor_pgm5(float c)
	{
		System.out.println("my 5th constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Constructor_pgm5 c1=new Constructor_pgm5();//1st way of 
		//calling Constructor but Reference variable should be different 
		Constructor_pgm5 c2=new Constructor_pgm5(10,20);
		new Constructor_pgm5(23);//2nd way of calling Constructor 
		Constructor_pgm5 c3=new Constructor_pgm5(10.5);
		new Constructor_pgm5(10.5f);
	}

}
